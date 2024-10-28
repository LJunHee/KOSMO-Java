package com.gimhae.framework.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public abstract class Template1 <T>{
	DataSource dataSource;
	public Template1(DataSource dataSource) {
		this.dataSource=dataSource;
	}
	public List<T> queryForList(String sql) throws SQLException {
		List<T> list=new ArrayList<>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=dataSource.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmtMapper(pstmt);
			rs=pstmt.executeQuery();
			while(rs.next())
				list.add(rowMapper(rs));
		}finally {
			close(rs,pstmt,conn);
		}
		return list;
	}
	
	public T queryForObject(String sql) throws SQLException {
		return queryForList(sql).get(0);
	}
	
	public abstract void pstmtMapper(PreparedStatement pstmt) throws SQLException;
	public abstract T rowMapper(ResultSet rs) throws SQLException;
	
	public void close(ResultSet rs,PreparedStatement pstmt,Connection conn) throws SQLException {
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
}