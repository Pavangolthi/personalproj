package com.mtc.app.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.mtc.app.entity.Product;
import com.mtc.app.entity.Supplier;

public class HibernateUtil {
	private static final SessionFactory SESSION_FACTORY;
	
	static {
		Configuration configuration = new Configuration();
		
		Properties properties = new Properties();
		
		properties.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
		properties.put(Environment.URL, "jdbc:mysql://localhost:3306/test?useSSL=false");
		properties.put(Environment.USER, "root");
		properties.put(Environment.PASS, "RamChandu@2020");
		properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		properties.put(Environment.SHOW_SQL, true);
		
		configuration.addAnnotatedClass(Product.class);
		configuration.addAnnotatedClass(Supplier.class);
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(properties).build();
		
		SESSION_FACTORY = configuration.buildSessionFactory(serviceRegistry);
	}
	
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
}
