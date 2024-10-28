package com.gimhae.emp.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component(value = "empDao")
//@Component
@Repository
public class EmpDaoImpl1 implements EmpDao<EmpVo> {
	Logger log=Logger.getLogger(getClass());
	@Autowired
	JdbcTemplate jdbcTemplate;
	RowMapper<EmpVo> mapper=new RowMapper<EmpVo>() {

		@Override
		public EmpVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new EmpVo(
					rs.getInt("empno"),rs.getInt("pay"),rs.getString("ename"),
					rs.getTimestamp("hiredate")
					);
		}
		
	};

	@Override
	public List<EmpVo> pullList() {
		String sql="select * from emp38 order by empno asc";
		List<EmpVo> list = jdbcTemplate.query(sql, mapper);
		log.debug(list.toString());
		return list;
	}

	@Override
	public EmpVo getList(int idx) {
		String sql="select * from emp38 where empno=?";
		EmpVo bean=jdbcTemplate.queryForObject(sql, mapper,idx);
		return bean;
	}

	@Override
	public void addList(EmpVo t) {
		String sql="insert into emp38 (ename,pay,hiredate) values (?,?,now())";
		jdbcTemplate.update(sql,t.getEname(),t.getPay());
	}

	@Override
	public int setList(EmpVo t) {
		String sql="update emp38 set ename=?,pay=? where empno=?";
		return jdbcTemplate.update(sql,t.getEname(),t.getPay(),t.getEmpno());
	}

	@Override
	public int rmList(int idx) {
		String sql="delete from emp38 where empno=?";
		return jdbcTemplate.update(sql,idx);
	}

	@Override
	public int listSize() {
		String sql="select count(*) from emp38";
		return jdbcTemplate.queryForInt(sql);
	}

}