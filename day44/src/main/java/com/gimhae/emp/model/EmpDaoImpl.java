package com.gimhae.emp.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.mysql.cj.jdbc.MysqlDataSource;


public class EmpDaoImpl extends JdbcDaoSupport implements EmpDao {
	RowMapper<EmpVo> rowMapper = new RowMapper<EmpVo>() {

		@Override
		public EmpVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return EmpVo.builder()
				.empno(rs.getInt("empno"))
				.ename(rs.getString("ename"))
				.pay(rs.getInt("pay"))
				.hiredate(rs.getDate("hiredate"))
				.build();
		}
		
	};
	
	public EmpDaoImpl() {
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setURL("jdbc:mysql://localhost:3306/xe");
		dataSource.setUser("scotte");
		dataSource.setPassword("tiger");
		super.setDataSource(dataSource);
	}
	
	@Override
	public List<EmpVo> pullList() {
		String sql = "select * from emp38 order by empno";
		return getJdbcTemplate().query(sql, rowMapper);
	}


	@Override
	public EmpVo getList() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void addList() {
		// TODO Auto-generated method stub

	}


	@Override
	public int setList() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int rmList() {
		// TODO Auto-generated method stub
		return 0;
	}

}
