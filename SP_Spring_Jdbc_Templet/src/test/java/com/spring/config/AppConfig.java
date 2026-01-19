package com.spring.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class AppConfig {
	
	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/smartprograming");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		return dataSource;
	}
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		
		jdbcTemplate.setDataSource(dataSource());
		
		
		return jdbcTemplate;
	}
	
	@Bean
	public NamedParameterJdbcTemplate namedPerameterJdbc(DataSource ds) {
		NamedParameterJdbcTemplate namedPerameterJdbc = new NamedParameterJdbcTemplate(ds);
		
		return namedPerameterJdbc;
		
	}
}
