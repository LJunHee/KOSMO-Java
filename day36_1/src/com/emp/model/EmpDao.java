package com.emp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class EmpDao {
	DataSource dataSource;
	
	public EmpDao() {
		try {
			InitialContext ctxt = new InitialContext();
			dataSource = (DataSource) ctxt.lookup("java:comp/env/jdbc/mysqlDB");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public List<EmpDto> pullList() throws SQLException{
		List<EmpDto> list = new ArrayList<EmpDto>();
		String sql = "select * from emp36 order by empno";
		try(
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			){
			while(rs.next()) {
				list.add(new EmpDto(
					rs.getInt("empno"),rs.getInt("pay"),rs.getString("ename"),rs.getDate("hiredate"),
					rs.getString("ordfile"),rs.getString("newfile")
					));
			}
			return list;
		}
	}
	
	public void addList(EmpDto bean) throws SQLException {
		String sql = "insert into emp36 (ename,pay,hiredate,ordfile,newfile) values (?,?,now(),?,?)";
		try(
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			){
			pstmt.setString(1, bean.getEname());
			pstmt.setInt(2, bean.getPay());
			pstmt.setString(3, bean.getOrdfile());
			pstmt.setString(4, bean.getNewfile());
			pstmt.executeUpdate();
		}
	}
}
