package com.gimhae.day49.emp.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmpVo {
	private int empno,pay,deptno;
	private String ename;
	@EqualsAndHashCode.Exclude
	private Timestamp hiredate;
}