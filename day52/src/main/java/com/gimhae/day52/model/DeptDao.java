package com.gimhae.day52.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface DeptDao {
	
	@Select(value = "select * from dept order by deptno")
	List<DeptVo> pullList();
	
	@Select(value = "select * from dept where deptno=#{deptno}")
	DeptVo getList(int deptno);
	
	@Update(value = "insert into dept (dname,loc) values (#{dname},#{loc})")
	int addList(DeptVo bean);
	
	@Update("update dept set dname=#{dname}, loc=#{loc} where deptno=#{deptno}")
	int setList(DeptVo bean);
	
	@Delete("delete from dept where deptno=#{val}")
	int rmList(int dpetno);
}