package com.gimhae.day48.emp.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmpVo {
	private int empno,pay;
	private String ename;
	private LocalDate hiredate;
}
