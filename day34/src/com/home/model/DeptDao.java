package com.home.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.home.util.Mysql;

public class DeptDao {

	public List<DeptDto> getList(){
		List<DeptDto> list=new ArrayList<>();
		String sql="select * from dept order by deptno";
		try(
				Connection conn=Mysql.getConnection();
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				){
			while(rs.next()) {
				DeptDto bean=new DeptDto();
				bean.setDeptno(rs.getInt("deptno"));
				bean.setDname(rs.getString("dname"));
				bean.setLoc(rs.getString("loc"));
				list.add(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void addList(String dname,String loc) {
		String sql="insert into dept (dname,loc) values ('"+dname+"','"+loc+"')";
		try(
				Connection conn=Mysql.getConnection();
				Statement stmt=conn.createStatement();
				){
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int removeList(int deptno) {
		String sql="delete from dept where deptno="+deptno;
		try(
				Connection conn=Mysql.getConnection();
				Statement stmt=conn.createStatement();
				){
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}















