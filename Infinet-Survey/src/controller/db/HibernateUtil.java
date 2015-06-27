package controller.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

@SuppressWarnings("deprecation")
public class HibernateUtil {

	public static final SessionFactory SESSION_FACTORY;
	
	static{
		
		Configuration configuration = new Configuration();
		configuration.configure();
		
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		SESSION_FACTORY = configuration.buildSessionFactory(serviceRegistry);
	}
	
	public static Session getSession(){
		return SESSION_FACTORY.openSession();
		
	}
}
