package com.gimhae.emp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

public class EmpDaoImpl2 implements EmpDao {
	DataSource dataSource;
	public EmpDaoImpl2() {
		MysqlDataSource dataSource=new MysqlDataSource();
		dataSource.setURL("jdbc:mysql://localhost:3306/xe");
		dataSource.setUser("scott");
		dataSource.setPassword("tiger");
		this.dataSource=dataSource;
	}
	@Override
	public List<EmpDto> pullList() throws SQLException{
		String sql="select empno,pay,ename,hiredate from emp38 order by empno";
		List<EmpDto> list=new ArrayList<>();
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				ResultSet rs=pstmt.executeQuery();
				){
			while(rs.next())
				list.add(new EmpDto(
						rs.getInt(1),rs.getInt(2),rs.getString(3)
						, LocalDate.from(rs.getDate(4).toLocalDate())
						));
		}
		return list;
	}
	@Override
	public void addList(String ename, int pay) throws SQLException {
		String sql="insert into emp38 (ename,pay,hiredate) values (?,?,now())";
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			pstmt.setString(1, ename);
			pstmt.setInt(2, pay);
			pstmt.executeUpdate();
		}
	}
	@Override
	public EmpDto getList(int empno) throws SQLException {
		String sql="select empno,pay,ename,hiredate from emp38 where empno=?";
		EmpDto bean=null;
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			pstmt.setInt(1, empno);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
				bean=new EmpDto(
						rs.getInt(1),rs.getInt(2),rs.getString(3),
						LocalDate.from(rs.getDate(4).toLocalDate())
						);
			rs.close();
		}
		return bean;
	}
	@Override
	public int editList(String ename, int pay, int empno) throws SQLException {
		String sql="update emp38 set ename=?,pay=? where empno=?";
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			pstmt.setString(1, ename);
			pstmt.setInt(2, pay);
			pstmt.setInt(3, empno);
			return pstmt.executeUpdate();
		}
	}
	@Override
	public int rmList(int empno) throws SQLException {
		String sql="delete from emp38 where empno=?";
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			pstmt.setInt(1, empno);
			return pstmt.executeUpdate();
		}
	}
}



















