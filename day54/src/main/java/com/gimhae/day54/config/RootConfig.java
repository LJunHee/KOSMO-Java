package com.gimhae.day54.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileUrlResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;

//<bean class="~~~"/>
@Configuration
@ComponentScan(basePackages = {"com.gimhae.day54"})
//<mybatis-spring:scan base-package="com.gimhae.day54.model"/>
@MapperScan("com.gimhae.day54.model")
public class RootConfig {

//<bean id="dataSource"
//	class="BasicDataSource"
//	p:driverClassName="org.h2.Driver"
//	p:url="jdbc:h2:tcp://localhost/~/test"
//	p:username="sa" p:password=""
//	/>
	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource=new BasicDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		return dataSource;
	}
	
//	<bean id="jdbcTemplate"
//	class="org.springframework.jdbc.core.JdbcTemplate">
//		<property name="dataSource" ref="dataSource"/>
//	</bean>	
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(dataSource());
		return template;
	}
	
//	<bean id="transactionManager" 
//	class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
//		<property name="dataSource" ref="dataSource"></property>
//	</bean>
	@Bean
	public TransactionManager transactionManager() {
		DataSourceTransactionManager transaction;
		transaction=new DataSourceTransactionManager(dataSource());
		return transaction;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
		factory.setDataSource(dataSource());
//		Resource mapperLocations=new ClassPathResource("/mappers/DeptMapper.xml");
//		factory.setMapperLocations(mapperLocations);
		return factory.getObject();
	}
	
//	@Bean
//	public SqlSession sqlSession() throws Exception {
//		return sqlSessionFactory().openSession();
//	}
	
	
}











