package com.home.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.home.util.Mysql;

public class EmpDao {
	public List<EmpDto> getList(){
		List<EmpDto> list = new ArrayList<>();
		String sql  = "SELECT a.sabun,a.ename, a.pay, b.dname FROM emp a "
			+ "left outer JOIN dept b ON a.deptno=b.deptno";
		try(
			Connection conn = Mysql.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			){
			while(rs.next()) {
				EmpDto bean = new EmpDto();
				bean.setEmpno(rs.getInt("a.sabun"));
				bean.setEname(rs.getString("a.ename"));
				bean.setPay(rs.getInt("a.pay"));
				bean.setDname(rs.getString("b.dname"));
				list.add(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public void addList(String ename, int pay) {
		String sql = "insert into emp (ename,pay) values ('"+ename+"','"+pay+"')";
		try(
			Connection conn = Mysql.getConnection();
			Statement stmt = conn.createStatement();
			){
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public EmpDto getOne(int sabun) {
		EmpDto bean = new EmpDto();
		//SELECT a.sabun,a.ename,b.ename AS mgrname FROM emp a INNER JOIN emp b ON a.mgr=b.sabun;
		String sql = "select sabun,ename,mgr,pay,(select dname from dept where deptno="
			+ "(select deptno from emp where sabun="+sabun+")) name from emp where sabun="+sabun;
		try(
			Connection conn = Mysql.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			){
			while(rs.next()) {
				bean.setEmpno(rs.getInt("sabun"));
				bean.setEname(rs.getString("ename"));
				bean.setPay(rs.getInt("pay"));
				bean.setMgr(rs.getInt("mgr"));
				bean.setDname(rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return bean;
	}
	
	public int editDeptno(int sabun,int deptno) {
		String sql = "update emp set deptno="+deptno+" where sabun ="+sabun;
		try(
			Connection conn = Mysql.getConnection();
			Statement stmt = conn.createStatement();
			){
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public List<EmpDto> getMgr(int sabun){
		List<EmpDto> list = new ArrayList<>();
		String sql = "select sabun,ename from emp where deptno=(select deptno from emp where sabun="+sabun+") "
					+ "and sabun !="+sabun;
		try(
			Connection conn = Mysql.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			){
			while(rs.next()) {
				EmpDto bean  = new EmpDto();
				bean.setEmpno(rs.getInt("sabun"));
				bean.setEname(rs.getString("ename"));
				list.add(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int editMgr(int sabun,int mgr) {
		String sql = "update emp set mgr="+mgr+" where sabun="+sabun;
		try(
			Connection conn = Mysql.getConnection();
			Statement stmt = conn.createStatement();
			){
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int removeList(int sabun) {
		String sql = "delete from emp where sabun="+sabun;
		try(
			Connection conn = Mysql.getConnection();
			Statement stmt = conn.createStatement();
			){
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public boolean login(String sabun, String ename) {
		String sql = "select count(*) as cnt from emp where sabun='"+sabun+"' and ename='"+ename+"'";
		try(
			Connection conn = Mysql.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			){
			if(rs.next()) {
				return rs.getInt("cnt")>0; 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
