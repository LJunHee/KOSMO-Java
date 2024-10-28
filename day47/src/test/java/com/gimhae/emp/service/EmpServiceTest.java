package com.gimhae.emp.service;

import static org.junit.Assert.assertNotNull;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmpServiceTest {
	static EmpService service;
	Model model;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context=null;
		context=new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		service=context.getBean(EmpService.class);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertNotNull(service);
	}
	
	@Test
	public void test2List() {
		Model model = new BindingAwareModelMap();
		service.list(model);
		Map<String, Object> map = model.asMap();
		Set<Entry<String, Object>> entrys = map.entrySet();
		for(Entry<String, Object> entry: entrys) {
			System.out.println(entry.getKey()+":"+entry.getValue().toString());
		}
	}
	
	@Test
	public void test3One() {
		service.oneList(model,6);
		System.out.println(model.asMap().get("bean"));
	}

}