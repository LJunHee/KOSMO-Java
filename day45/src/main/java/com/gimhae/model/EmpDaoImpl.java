package com.gimhae.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;

public class EmpDaoImpl implements EmpDao {
	JdbcTemplate jdbcTemplate;
	PlatformTransactionManager transactionManager;
	TransactionDefinition definition;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
	
	public void setDefinition(TransactionDefinition definition) {
		this.definition = definition;
	}
	
	RowMapper<EmpVo> rowMapper;
	
	public EmpDaoImpl() {
		rowMapper=new RowMapper<EmpVo>() {
			
			@Override
			public EmpVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				return EmpVo.Builder()
							.empno(rs.getInt("empno"))
							.ename(rs.getString("ename"))
							.pay(rs.getInt("pay"))
							.hiredate(rs.getDate("hiredate"))
							.build();
			}
		};
	}

	@Override
	public List<EmpVo> pullList() {
		String sql="select * from emp38 order by empno";
		return jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public EmpVo getList(int idx) {
		String sql="select * from emp38 where empno=?";
		return jdbcTemplate.queryForObject(sql, rowMapper,idx);
	}

	@Override
	public int addList(EmpVo bean) {
		String sql="insert into emp38 (ename,pay,hiredate) values (?,?,now())";
		int result=0;

		TransactionStatus status=transactionManager.getTransaction(definition);
		try {
			result=jdbcTemplate.update(sql,bean.getEname(),bean.getPay());
			transactionManager.commit(status);
		}catch (Exception e) {
			transactionManager.rollback(status);
		}
		return result;
	}

	@Override
	public int setList(EmpVo bean) {
		String sql="update emp38 set ename=?,pay=? where empno=?";

		TransactionStatus status=transactionManager.getTransaction(definition);
		try {
			int result= jdbcTemplate.update(sql,bean.getEname(),bean.getPay(),bean.getEmpno());
			transactionManager.commit(status);
			return result;
		}catch (Exception e) {
			transactionManager.rollback(status);
			return 0;
		}
	}

	@Override
	public int rmList(int idx) {
		String sql="delete from emp38 where empno=?";
		TransactionStatus status=transactionManager.getTransaction(definition);
		try {
			int result= jdbcTemplate.update(sql,idx);
			transactionManager.commit(status);
			return result;
		}catch (Exception e) {
			transactionManager.rollback(status);
			return 0;
		}
	}

	@Override
	public int listSize() {
		String sql="select count(*) as cnt from emp38";
		return jdbcTemplate.queryForInt(sql);
	}

}








