package utils;
import modeles.*;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


import java.util.Properties;

import javax.mail.Address;

import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

//import com.api.entity.Employee;
 
public class SessionUtil {
	private static SessionFactory factory;
	
	private SessionUtil() {}
	
	public static SessionFactory getFactory() {
		if(factory == null) {
			Configuration configuration = new Configuration();
			
			Properties settings = new Properties();
			settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			settings.put(Environment.URL, "jdbc:mysql://localhost:3306/tp9DB");
			settings.put(Environment.USER, "root");
			settings.put(Environment.PASS, "");
			
			settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");

			settings.put(Environment.SHOW_SQL, "false");
			settings.put(Environment.HBM2DDL_AUTO, "update");
			
			configuration.setProperties(settings);
			configuration.addAnnotatedClass(Address.class);
			configuration.addAnnotatedClass(Film.class);
//			configuration.addAnnotatedClass(Employee.class);
			
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties())
					.build();
			
			factory = configuration.buildSessionFactory(serviceRegistry);
		}
		
		return factory;
	}

}