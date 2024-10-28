package com.emp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.home.util.Mysql;

public class EmpDao {
	// 
	Logger log = Logger.getGlobal();
	
	public EmpDao() {
		//log.setLevel(Level.SEVERE); 심각
		//log.setLevel(Level.WARNING); 주의
		log.setLevel(Level.INFO); // 정보 
		//log.setLevel(Level.FINE);
		//log.setLevel(Level.CONFIG);
	}
	
	public List<EmpDto> getList(int page) throws SQLException{

		List<EmpDto> list = new ArrayList<>();
		String sql = "SELECT * FROM (SELECT * FROM emp35 ORDER BY empno DESC) a LIMIT 10 OFFSET ?;";
		try(
			Connection conn = Mysql.getConnection();
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery(sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			){
			
			pstmt.setInt(1, (page-1)*10);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpDto bean  = new EmpDto();
				bean.setEmpno(rs.getInt("empno"));
				bean.setEname(rs.getString("ename"));
				bean.setHiredate(rs.getTimestamp("hiredate"));
				bean.setPay(rs.getInt("pay"));
				list.add(bean);
			}
			rs.close();
		}
		log.info(list.toString());
		return list;
	}
	
	public void addList(String ename,int pay) throws SQLException {
		
		
		//injection 방어
		//user11',1111,'2000/01/01') ##
//		ename = ename.replace("\'", "´");
//		ename = ename.replace("\"", "˝");
//		ename = ename.replace("+", "＋");
//		ename = ename.replace("-", "－");
//		ename = ename.replace(",", "，");
//		ename = ename.replace("#", "＃");
//		ename = ename.replace("(", "（");
//		ename = ename.replace(")", "）");
		String sql = "insert into emp35 (ename,pay,hiredate) values (?,?,now())";
		
		try(
			Connection conn = Mysql.getConnection();
//			Statement stmt = conn.createStatement();
			//PreparedStatement 성능우수
			PreparedStatement pstmt = conn.prepareStatement(sql);
			){
			pstmt.setString(1, ename);
			pstmt.setInt(2, pay);
			pstmt.executeUpdate();
		}
	}
	
	public EmpDto oneList(int empno) throws SQLException {
		String sql = "select * from emp35 where empno=?";
		EmpDto bean = new EmpDto();
		try(
			Connection conn = Mysql.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			){
			pstmt.setInt(1, empno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				bean.setEmpno(empno);
				bean.setEname(rs.getString("ename"));
				bean.setHiredate(rs.getTimestamp("hiredate"));
				bean.setPay(rs.getInt("pay"));
			}
			rs.close();
		}
		return bean;
	}
	
	public int editList(int empno,String ename,int pay) throws SQLException {
		String sql = "update emp35 set ename=?,pay=?,hiredate=now() where empno=?";
		
		try(
			Connection conn = Mysql.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			){
			pstmt.setString(1,ename);
			pstmt.setInt(2, pay);
			pstmt.setInt(3, empno);
			pstmt.executeUpdate();
		}
		return 0;
	}
	
	public int removeList(int empno) throws SQLException {
		String sql = "delete from emp35 where empno=?";
		try(
			Connection conn = Mysql.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			){
			pstmt.setInt(1,empno);
			return pstmt.executeUpdate();
		}
	}
}
