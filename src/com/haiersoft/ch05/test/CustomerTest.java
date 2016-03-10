package com.haiersoft.ch05.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.haiersoft.ch05.entity.Customer;
import com.haiersoft.ch05.utils.HibernateUtils;

public class CustomerTest {

	/**
	 * 功能 : Hibernate测试
	
	 * 开发：zwwang 2015-1-24
	
	 * @param args
	 */
	public static void main(String[] args) {
//		queryCustomer();
//		querySqlCustomer();
//		saveCustomer();
//		updateCustomer();
		deleteCustomer();
	}
	
	public static void saveCustomer() {
		//创建Customer对象
		Customer customer = new Customer("zhangsan","123","zhang","qingdao","123456789");
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
		session.close();
	}
	
	public static void queryCustomer() {
		Session session = HibernateUtils.getSession();
		String sqlString = "SELECT customer.id, customer.userName FROM Customer customer";
		Query query = session.createQuery(sqlString);
		List<Object[]> list = query.list();
		for (Object[] objects : list) {
			System.out.println(objects[0]);
		}
//		List<Customer> list = query.list();
//		for (Customer customer : list) {
//			System.out.println(customer.getAddress());
//		}
	}
	
	@SuppressWarnings("unchecked")
	public static void querySqlCustomer() {
		Session session = HibernateUtils.getSession();
		String sqlString = "SELECT * FROM CUSTOMER WHERE userName = :userName";
		Query query = session.createSQLQuery(sqlString);
//		query.setParameter("userName", "zhangsan");
		Customer customer = new Customer("zhangsan","123","zhang","qingdao","123456789");
		query.setProperties(customer);
		query.setFirstResult(0);
		query.setMaxResults(3);
		List<Object[]> list = query.list();
		for (Object[] objects : list) {
			System.out.println(objects[0]);
		}
	}
	
	public static void updateCustomer() {
		Session session = HibernateUtils.getSession();
		Transaction transaction = session.beginTransaction();
//		String sqlString = "FROM Customer customer WHERE customer.id = :id";
//		Query query = session.createQuery(sqlString);
//		query.setParameter("id", 1);
//		Customer customer = (Customer) query.uniqueResult();
		Customer customer = (Customer) session.get(Customer.class, 1);
		customer.setUserName("hanlei");
		session.update(customer);
		transaction.commit();
		HibernateUtils.closeSession();
//		System.out.println(customer.getUserName());
	}
	
	public static void deleteCustomer() {
		Session session = HibernateUtils.getSession();
		Transaction transaction = session.beginTransaction();
		String sqlString = "DELETE FROM CUSTOMER WHERE ID = :id";
		Query query = session.createSQLQuery(sqlString);
		query.setParameter("id", 1);
		query.executeUpdate();
		transaction.commit();
		HibernateUtils.closeSession();
	}
	

}
