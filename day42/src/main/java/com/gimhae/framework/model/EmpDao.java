package com.gimhae.framework.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.apache.log4j.Logger;

import com.gimhae.framework.jdbc.JdbcTemplate;
import com.gimhae.framework.jdbc.RowMapper;
import com.mysql.cj.jdbc.MysqlDataSource;



public class EmpDao {
	Logger log=Logger.getLogger(this.getClass());
//	DataSource dataSource;
	boolean test;
	JdbcTemplate<EmpDto> template;
	
	public EmpDao() {
		MysqlDataSource dataSource=new MysqlDataSource();
		dataSource.setURL("jdbc:mysql://localhost:3306/xe");
		dataSource.setUser("scott");
		dataSource.setPassword("tiger");
//		this.dataSource=dataSource;
		template=new JdbcTemplate<EmpDto>(dataSource);
	}
	public EmpDao(boolean test) {
		this();
		this.test=test;
	}
	
	public List<EmpDto> pullList() throws SQLException{
		String sql="select * from emp38 order by empno";
//		JdbcTemplate<EmpDto> template=new JdbcTemplate<EmpDto>(dataSource);
		
		RowMapper<EmpDto> mapper=new RowMapper<EmpDto>(){
			@Override
			public EmpDto mapper(ResultSet rs) throws SQLException {
				return new EmpDto(
						rs.getInt("empno"),rs.getInt("pay"),rs.getString("ename"),
						LocalDate.from(rs.getDate("hiredate").toLocalDate())
						);
			}
		};
		return template.query(sql,mapper);
	}
	
	public EmpDto getList(int pk) throws SQLException {
		String sql="select * from emp38 where empno=?";
//		JdbcTemplate<EmpDto> template=new JdbcTemplate<EmpDto>(dataSource);
		return template.queryForObject(sql, new RowMapper<EmpDto>() {

			@Override
			public EmpDto mapper(ResultSet rs) throws SQLException {
				return new EmpDto(
						rs.getInt("empno"),rs.getInt("pay"),rs.getString("ename"),
						LocalDate.from(rs.getDate("hiredate").toLocalDate())
						);
			}
			
		}, pk);
	}
	
	public int addList(EmpDto bean) throws SQLException {
		String sql="insert into emp38 (ename,hiredate,pay) values (?,now(),?)";
//		JdbcTemplate template=new JdbcTemplate(dataSource);
		template.setTest(test);
		return template.update(sql, bean.getEname(),bean.getPay());
	}
	
	public int rmList(int pk) throws SQLException {
		String sql="delete from emp38 where empno=?";
//		JdbcTemplate template=new JdbcTemplate(dataSource);
		template.setTest(test);
		return template.update(sql, pk);
	}
	
	public int editList(EmpDto bean) throws SQLException {
		String sql="update emp38 set ename=?,pay=? where empno=?";
//		JdbcTemplate template=new JdbcTemplate(dataSource);
		template.setTest(test);
		return template.update(sql, bean.getEname(),bean.getPay(),bean.getEmpno());
	}
}







