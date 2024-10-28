package com.gimhae.framework.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public abstract class Template2 {
	DataSource dataSource;
	
	public Template2(DataSource dataSource) {
		this.dataSource=dataSource;
	}
	
	public abstract void pstmtMapper(PreparedStatement pstmt) throws SQLException;
	
	public int executeUpdate(String sql) throws SQLException {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=dataSource.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmtMapper(pstmt);
			return pstmt.executeUpdate();
		}finally {
			close(null,pstmt,conn);
		}
	}
	public void close(ResultSet rs,PreparedStatement pstmt,Connection conn) throws SQLException {
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
}