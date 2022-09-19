package com.mtc.app.config;

import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.mtc.app.entity.Product;

@ComponentScan("com.mtc.app")
@Configuration
public class AppConfig {
	
	@Bean(name="dataSource")
	public BasicDataSource getDataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		basicDataSource.setUrl("jdbc:mysql://localhost:3306/test?useSSL=false");
		basicDataSource.setUsername("root");
		basicDataSource.setPassword("RamChandu@2020");
		basicDataSource.setInitialSize(5);
		basicDataSource.setMaxTotal(10);
		return basicDataSource;
		}
	
	@Bean(name="jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean(name="sessionFactory")
	public LocalSessionFactoryBean getSession() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		sessionFactory.setHibernateProperties(getHibernateProp());
		sessionFactory.setPackagesToScan("com.mtc.app.entity");
		sessionFactory.setAnnotatedClasses(Product.class);
		return sessionFactory;
	}
	
	private Properties getHibernateProp() {
		Properties properties = new Properties();
	    properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
	    properties.setProperty("hibernate.show_sql", "true");
	    return properties;
	}
}
