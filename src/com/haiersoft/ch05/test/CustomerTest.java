package com.haiersoft.ch05.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.haiersoft.ch05.entity.Customer;

public class CustomerTest {

	/**
	 * 功能 : Hibernate测试
	
	 * 开发：zwwang 2015-1-24
	
	 * @param args
	 */
	public static void main(String[] args) {
	/*	//创建Customer对象
		Customer customer = new Customer("zhangsan","123","张三","青岛","123456789");
		//实例化Configuration
		Configuration configuration = new Configuration();
		//加载hibernate.cfg.xml文件
		configuration.configure("/hibernate.cfg.xml");
		//创建SessionFactory
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		//打开session
		Session session = sessionFactory.openSession();
		//开始一个事务
		Transaction transaction = session.beginTransaction();
		//持久化操作
		session.save(customer);
		//提交事务
		transaction.commit();
		//关闭session
		session.close();*/
	}

}
