package com.gimhae.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.gimhae.framework.jdbc.Template1;
import com.gimhae.framework.jdbc.Template2;
import com.mysql.cj.jdbc.MysqlDataSource;

public class EmpDao {
	private DataSource dataSource;
	
	public EmpDao() {
		MysqlDataSource dataSource=new MysqlDataSource();
		dataSource.setURL("jdbc:mysql://localhost:3306/xe");
		dataSource.setUser("scott");
		dataSource.setPassword("tiger");
		this.dataSource=dataSource;
	}
	
	public List<EmpDto> pullList() throws SQLException{
		String sql="select * from emp38 order by empno";
		Template1<EmpDto> template=new Template1<EmpDto>(dataSource){
			
			@Override
			public EmpDto rowMapper(ResultSet rs) throws SQLException {
				return new EmpDto(
						rs.getInt("empno"),rs.getInt("pay"),rs.getString("ename"),
						LocalDate.from(rs.getDate("hiredate").toLocalDate())
						);
			}
			
			@Override
			public void pstmtMapper(PreparedStatement pstmt) throws SQLException {
			}
		};
		return template.queryForList(sql);
	}

	public EmpDto getList(int empno) throws SQLException {
		String sql="select * from emp38 where empno=?";
		Template1<EmpDto> template=new Template1<EmpDto>(dataSource) {
			
			@Override
			public EmpDto rowMapper(ResultSet rs) throws SQLException {
				return new EmpDto(
						rs.getInt("empno"),rs.getInt("pay"),rs.getString("ename"),
						LocalDate.from(rs.getDate("hiredate").toLocalDate())
						);
			}
			
			@Override
			public void pstmtMapper(PreparedStatement pstmt) throws SQLException {
				pstmt.setInt(1, empno);
			}
		};
		return template.queryForObject(sql);
	}

	public void addList(String ename, int pay) throws SQLException {
		String sql="insert into emp38 (ename,pay,hiredate) values (?,?,now())";
		Template2 template=new Template2(dataSource) {

			@Override
			public void pstmtMapper(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, ename);
				pstmt.setInt(2, pay);
			}
			
		};
		template.executeUpdate(sql);
	}
	
	public int rmList(int pk) throws SQLException {
		String sql="delete from emp38 where empno=?";
		Template2 template=new Template2(dataSource) {
			
			@Override
			public void pstmtMapper(PreparedStatement pstmt) throws SQLException {
				pstmt.setInt(1, pk);
			}
		};
		return template.executeUpdate(sql);
	}

	
}















