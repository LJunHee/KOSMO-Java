package com.gimhae.emp.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmpDaoImpl extends JdbcDaoSupport implements EmpDao {
	RowMapper<EmpVo> rowMapper=new RowMapper<EmpVo>() {
		
		@Override
		public EmpVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new EmpVo(
					rs.getInt("empno"),rs.getInt("pay"),rs.getString("ename"),
					rs.getDate("hiredate")
					);
		}
	};

	public List<EmpVo> pullList(){
		String sql="select * from emp38 order by empno";
		return getJdbcTemplate().query(sql, rowMapper);
	}

	@Override
	public void addList(String ename, int pay) {
		String sql="insert into emp38 (ename,pay,hiredate) values (?,?,now())";
		getJdbcTemplate().update(sql,ename,pay);
	}

	@Override
	public EmpVo getList(int empno) {
		String sql="select * from emp38 where empno=?";
		return getJdbcTemplate().queryForObject(sql, rowMapper,empno);
	}

	@Override
	public int setList(EmpVo bean) {
		String sql="update emp38 set ename=?,pay=? where empno=?";
		return getJdbcTemplate().update(sql,bean.getEname(),bean.getPay(),bean.getEmpno());
	}

	@Override
	public int rmList(int empno) {
		String sql="delete from emp38 where empno=?";
		return getJdbcTemplate().update(sql,empno);
	}
}







