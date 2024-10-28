package com.bbs.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.Mysql;

public class BbsDao {

	public List<BbsDto> getList() throws SQLException {
		List<BbsDto> list = new ArrayList<BbsDto>();
		String sql = "select * from bbs01 order by num desc";
		try(
			Connection conn = Mysql.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql); 
			){
			while(rs.next()) {
				BbsDto bean = new BbsDto();
				bean.setNum(rs.getInt("num"));
				bean.setSub(rs.getString("sub"));
				bean.setId(rs.getString("id"));
				bean.setCnt(rs.getInt("cnt"));
				list.add(bean);
			}
		}
		return list;
	}
	
	public int add(String sub,String id,String content) throws SQLException {
		String sql = "insert into bbs01 (sub,id,content,nalja) values ('"+sub+"','"+id+"','"+content+"',now())";
		try(
			Connection conn = Mysql.getConnection();
			Statement stmt = conn.createStatement();
			){
			return stmt.executeUpdate(sql);
		}
	}
	
	public BbsDto getOne(int num) throws SQLException {
		BbsDto bean = new BbsDto();
		String sql = "select * from bbs01 where num="+num;
		try(
			Connection conn = Mysql.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			){
			if(rs.next()) {
				bean.setCnt(rs.getInt("cnt"));
				bean.setContent(rs.getString("content"));
				bean.setId(rs.getString("id"));
				bean.setNalja(rs.getTimestamp("nalja"));
				bean.setNum(rs.getInt("num"));
				bean.setSub(rs.getString("sub"));
			}
			return bean;
		}
	}
	
	public int updateOne(int num,String sub,String id,String content) throws SQLException {
		String sql = "update bbs01 set sub='"+sub+"',id='"+id+"',content='"+content+"',nalja=now() where num="+num;
		
		try(
			Connection conn = Mysql.getConnection();
			Statement stmt = conn.createStatement();
			){
			return stmt.executeUpdate(sql);
		}
	}
	
	public int deleteOne(int num) throws SQLException {
		String sql = "delete from bbs01 where num="+num;
		try(
			Connection conn = Mysql.getConnection();
			Statement stmt = conn.createStatement();
			){
			return stmt.executeUpdate(sql);
		}
	}
	
	public int countUp(int num) throws SQLException {
		String sql = "update bbs01 set cnt=cnt+1 where num="+num;
		try(
			Connection conn = Mysql.getConnection();
			Statement stmt = conn.createStatement();
			){
			return stmt.executeUpdate(sql);
		}
	}
}
