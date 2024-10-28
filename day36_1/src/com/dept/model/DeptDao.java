package com.dept.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DeptDao {
	private DataSource dataSource;
	
	public DeptDao() {
		try {
			InitialContext init = new InitialContext();
			//jndi 규격
			Context context = (Context) init.lookup("java:/comp/env");
			dataSource =(DataSource)context.lookup("jdbc/mysqlDB");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public List<DeptDto> pullList() throws SQLException{
		List<DeptDto> list = new ArrayList<>();
		String sql = "select * from dept36 order by deptno";
		try(
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			){
			while(rs.next()) {
				list.add(new DeptDto(
					rs.getInt("deptno"),rs.getString("dname"),rs.getString("loc"),
					rs.getString("ordfile"),rs.getString("newfile")
					));
			}
		}
		return list;
	}
	
	public void addList(DeptDto bean) throws SQLException {
		String sql = "insert into dept36 (dname,loc,ordfile,newfile) values (?,?,?,?)";
		try(
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			){
			pstmt.setString(1, bean.getDname());
			pstmt.setString(2, bean.getLoc());
			pstmt.setString(3, bean.getOrdfile());
			pstmt.setString(4, bean.getNewfile());
			pstmt.executeUpdate();
		}
	}
	
}
