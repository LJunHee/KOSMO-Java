package com.gimhae.emp.model;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mysql.cj.jdbc.MysqlDataSource;

public class EmpDaoImpl implements EmpDao {
	JdbcTemplate jdbcTemplate;
	
	RowMapper<EmpDto> rowMapper = new RowMapper<EmpDto>() {
		
		@Override
		public EmpDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			return new EmpDto(
				rs.getInt("empno"),rs.getInt("pay"),rs.getString("ename"),
				LocalDate.from(rs.getDate("hiredate").toLocalDate())
				);
		}
	};
	
	
	public EmpDaoImpl() {
		jdbcTemplate = new JdbcTemplate();
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setURL("jdbc:mysql://localhost:3306/xe");
		dataSource.setUser("scott");
		dataSource.setPassword("tiger");
		jdbcTemplate.setDataSource(dataSource);
	}
	
	public List<EmpDto> pullList(){
		String sql = "select * from emp38 order by empno desc";
		return jdbcTemplate.query(sql, rowMapper);
	}
	
	public EmpDto getList(int pk) {
		String sql = "select * from emp38 where empno=?";
		return jdbcTemplate.queryForObject(sql, rowMapper,pk);
	}
	
	public void addList(String ename,int pay) {
		String sql = "insert into emp38 (ename,pay,hiredate) values (?,?,now())";
		jdbcTemplate.update(sql,ename,pay);
	}
	
	public int editList(String ename,int pay, int empno	) {
		String sql = "update emp38 set ename=?, pay=? where empno=?";
		return jdbcTemplate.update(sql,ename,pay,empno);
	}
	
	public int rmList(int pk) {
		String sql = "delete from emp38 where empno=?";
		return jdbcTemplate.update(sql,pk);
	}
}
