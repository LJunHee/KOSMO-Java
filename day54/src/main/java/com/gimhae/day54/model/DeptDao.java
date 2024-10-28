package com.gimhae.day54.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface DeptDao {

	@Select("SELECT * FROM DEPT ORDER BY DEPTNO")
	List<DeptVo> pullList();

	@Insert("INSERT INTO DEPT (DEPTNO,DNAME,LOC) VALUES (#{deptno},#{dname},#{loc})")
	void addList(DeptVo bean);

	@Select("SELECT * FROM DEPT WHERE DEPTNO=#{int}")
	DeptVo getList(int deptno);
	
	@Update("UPDATE DEPT SET DNAME=#{dname},LOC=#{loc} WHERE DEPTNO=#{deptno}")
	int setList(DeptVo bean);
	
	@Delete("DELETE FROM DEPT WHERE DEPTNO=#{int}")
	int rmList(int deptno);
}