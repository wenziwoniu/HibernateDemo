package com.haiersoft.ch05.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static final String CONFIG_FILE_LOCATION = "/hibernate.cfg.xml";
	private static final ThreadLocal<Session> THREAD_LOCAL = new ThreadLocal<Session>();
	private static Configuration configuration = new Configuration();
	private static SessionFactory sessionFactory;
	private static String configFile = CONFIG_FILE_LOCATION;
	/*静态代码块创建SessionFactory*/
	static {
		try {
			configuration.configure(configFile);
			sessionFactory = configuration.buildSessionFactory();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	//返回ThreadLocal中的session实例
	public static Session getSession() {
		/**
		 * java.lang.ThreadLocal类可以为每个线程保存一份独立的变量副本，所以每个线程都可以隔离访问自己的变量，
		 * 而不会影响其它线程。ThreadLocal为解决多线程下的并发问题提供了一种简易快捷的方案。
		 */
		Session session = (Session)THREAD_LOCAL.get();
		if (session == null || !session.isOpen()) {
			session = sessionFactory.openSession();
			THREAD_LOCAL.set(session);
		}
		return session;
	}
	public static void closeSession() {
		Session session = THREAD_LOCAL.get();
		THREAD_LOCAL.set(null);
		if (session != null) {
			session.close();
		}
	}
}
