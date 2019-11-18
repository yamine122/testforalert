package com.jeong.web.ctx;
import javax.sql.DataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
@Configuration
@MapperScan(basePackages = {"com.jeong.web"})
@ComponentScan(basePackages = {"com.jeong.web"})
public class RootContext {
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/ship?serverTimezone=UTC");
	    dataSource.setUsername("ship");
	    dataSource.setPassword("ship");
		return dataSource;
}
	@Bean 
		public DataSourceTransactionManager txManager() {
		return new DataSourceTransactionManager(dataSource());
	}
}
