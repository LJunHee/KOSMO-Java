package com.emp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

import com.mysql.cj.jdbc.MysqlDataSource;

public class EmpDao {
	Logger log=Logger.getLogger(getClass());
	DataSource dataSource;
	
	public EmpDao(){
//		InitialContext ctxt = new InitialContext();
//		dataSource=(DataSource) ctxt.lookup("java:/comp/env/jdbc/mysqlDB");
		MysqlDataSource dataSource=new MysqlDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/xe");
		dataSource.setUser("scott");
		dataSource.setPassword("tiger");
		this.dataSource=dataSource;
	}
	
	public List<EmpDto> pullList() throws SQLException{
		List<EmpDto> list=new ArrayList<EmpDto>();
		String sql="select * from emp38 order by empno";
		try(
			Connection conn=dataSource.getConnection();	
			PreparedStatement pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
				){
			while(rs.next())
				list.add(new EmpDto(
						rs.getInt("empno"),rs.getInt("pay"),
						rs.getString("ename"),rs.getDate("hiredate")
						));
		}
		log.debug(list.toString());
		return list;
	}
	
	public EmpDto getList(int pk) throws SQLException {
		EmpDto bean=null;
		String sql="select * from emp38 where empno=?";
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			pstmt.setInt(1, pk);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
				bean=new EmpDto(
						rs.getInt("empno"),rs.getInt("pay"),
						rs.getString("ename"),rs.getDate("hiredate")
						);
			rs.close();
		}
		return bean;
	}
	
	public int pushList(EmpDto bean) throws SQLException {
		String sql="insert into emp38 (ename,pay,hiredate) values (?,?,now())";
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			pstmt.setString(1, bean.getEname());
			pstmt.setInt(2, bean.getPay());
			return pstmt.executeUpdate();
		}
	}
	
	public int editList(EmpDto bean) throws SQLException {
		String sql="update emp38 set ename=?,pay=? where empno=?";
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			pstmt.setString(1, bean.getEname());
			pstmt.setInt(2, bean.getPay());
			pstmt.setInt(3, bean.getEmpno());
			return pstmt.executeUpdate();
		}
	}
	
	public int removeList(int pk) throws SQLException {
		String sql="delete from emp38 where empno=?";
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			pstmt.setInt(1, pk);
			return pstmt.executeUpdate();
		}
	}
}












