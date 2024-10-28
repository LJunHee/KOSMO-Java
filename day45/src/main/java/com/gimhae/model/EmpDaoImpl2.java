package com.gimhae.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class EmpDaoImpl2 implements EmpDao {
	JdbcTemplate jdbcTemplate;
	PlatformTransactionManager transactionManager;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
	
	RowMapper<EmpVo> rowMapper;
	
	public EmpDaoImpl2() {
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
		PreparedStatementCreator psc=null;
		psc=new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pstmt=con.prepareStatement(sql);
				return pstmt;
			}
		};
		return jdbcTemplate.query(psc, rowMapper);
	}

	@Override
	public EmpVo getList(int idx) {
		String sql="select * from emp38 where empno=?";
		return jdbcTemplate.queryForObject(sql, rowMapper,idx);
	}

	@Override
	public int addList(EmpVo bean) {
		String sql="insert into emp38 (empno,ename,pay,hiredate) values (3,?,?,now())";
//		String sql2="insert into emp38 (empno,ename,pay,hiredate) values ((select max(empno) from emp38),?,?,now())";
		String sql2="insert into emp38 (empno,ename,pay,hiredate) values (4,?,?,now())";
		
		TransactionDefinition definition=new DefaultTransactionDefinition();
		TransactionStatus status=transactionManager.getTransaction(definition);
		try {
		PreparedStatementCreator psc=null;
		psc=new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				System.out.println(con.hashCode());
				PreparedStatement pstmt=con.prepareStatement(sql);
				pstmt.setString(1, bean.getEname());
				pstmt.setInt(2, bean.getPay());
				return pstmt;
			}
		};
		jdbcTemplate.update(psc);
		psc=new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				System.out.println(con.hashCode());
				PreparedStatement pstmt=con.prepareStatement(sql2);
				pstmt.setString(1, bean.getEname());
				pstmt.setInt(2, bean.getPay());
				return pstmt;
			}
		};
		int result= jdbcTemplate.update(psc);
		transactionManager.commit(status);
		return result;
		}catch (Exception e) {
			transactionManager.rollback(status);
			return 0;
		}
	}

	@Override
	public int setList(EmpVo bean) {
		String sql="update emp38 set ename=?,pay=? where empno=?";
		return jdbcTemplate.update(sql,bean.getEname(),bean.getPay(),bean.getEmpno());
	}

	@Override
	public int rmList(int idx) {
		String sql="delete from emp38 where empno=?";
		return jdbcTemplate.update(sql,idx);
	}

	@Override
	public int listSize() {
		String sql="select count(*) as cnt from emp38";
		return jdbcTemplate.queryForInt(sql);
	}

}








