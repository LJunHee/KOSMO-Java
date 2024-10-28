package com.gimhae.day54.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

//@Repository
public class DeptDaoImpl implements DeptDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	RowMapper<DeptVo> rowMapper =new RowMapper<DeptVo>() {
		
		@Override
		public DeptVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return DeptVo.builder()
					.deptno(rs.getInt("deptno"))
					.dname(rs.getString("dname"))
					.loc(rs.getString("loc"))
					.build();
		}
	};
	@Override
	public List<DeptVo> pullList(){
		return jdbcTemplate.query("select * from dept", rowMapper);
	}
	
	@Override
	public void addList(DeptVo bean) {
		jdbcTemplate.update("insert into dept (deptno,dname,loc) values (?,?,?)"
				,bean.getDeptno(),bean.getDname(),bean.getLoc()); 
	}

	@Override
	public DeptVo getList(int deptno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setList(DeptVo bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int rmList(int deptno) {
		// TODO Auto-generated method stub
		return 0;
	}
}















