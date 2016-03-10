package com.haiersoft.ch05.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.haiersoft.ch05.entity.Customer;
import com.haiersoft.ch05.utils.HibernateUtils;

public class CustomerHQLTest {

	/**
	 * 功能 : Hibernate查询
	
	 * 开发：zwwang 2015-1-24
	
	 * @param args
	 */
	public static void main(String[] args) {
		/*//实例化Configuration
		Configuration configuration = new Configuration();
		//加载hibernate.cfg.xml文件
		configuration.configure("/hibernate.cfg.xml");
		//创建SessionFactory
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		//打开session
		Session session = sessionFactory.openSession();
		//开始一个事务
		Transaction transaction = session.beginTransaction();
		//查询Customer表
		Query query = session.createQuery("from Customer");
		//criteria查询
		Criteria criteria = session.createCriteria(Customer.class);
		Session session = HibernateUtils.getSession();
//		Session session2 = HibernateUtils.getSession();
		//开始一个事务
		Transaction transaction = session.beginTransaction();
		Transaction transaction2 = session.beginTransaction();
		//查询Customer表
		Query query = session.createQuery("from Customer");
		Query query2 = session.createQuery("");
		//执行查询
		List<Customer> list = query.list();
		for (Customer customer : list) {
			System.out.println(customer.getAddress());
		}
		transaction.commit();
		HibernateUtils.closeSession();*/
	}

}
