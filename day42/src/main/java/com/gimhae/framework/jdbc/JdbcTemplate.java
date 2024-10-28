package com.gimhae.framework.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;


public class JdbcTemplate<T> {
	Logger log=Logger.getLogger(this.getClass());
	DataSource dataSource;
	boolean test;
	
	public JdbcTemplate() {
	}

	public JdbcTemplate(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}
	
	public void setTest(boolean test) {
		this.test = test;
	}

	public int update(String sql,Object ... args) throws SQLException {
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			if(test) conn.setAutoCommit(false);
			for(int i=0; i<args.length; i++)
				pstmt.setObject(i+1, args[i]);
			int result=pstmt.executeUpdate();
			if(test) conn.rollback();
			if(test) conn.setAutoCommit(true);
			return result;
		}
	}
	
	public T queryForObject(String sql,RowMapper<T> rowMapper,Object ... args) throws SQLException {
		return query(sql,rowMapper,args).get(0);
	}
	
	public List<T> query(String sql,RowMapper<T> rowMapper,Object ... args) throws SQLException {
		List<T> list=new ArrayList<>();
		try(
				Connection conn=dataSource.getConnection();
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			for(int i=0; i<args.length; i++) {
				pstmt.setObject(i+1, args[i]);
			}
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
				list.add(rowMapper.mapper(rs));
		}
		log.debug(list.toString());
		return list;
	}
	
}














