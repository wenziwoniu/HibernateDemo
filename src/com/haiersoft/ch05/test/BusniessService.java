package com.haiersoft.ch05.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.haiersoft.ch05.entity.Customer;
import com.haiersoft.ch05.entity.OrderTest;
import com.haiersoft.ch05.utils.HibernateUtils;

public class BusniessService {
	public static void main(String[] args) {
		//添加客户和订单信息
//		addCustomerAndOrder();
//		findOrder(Integer.parseInt("11"));
		findOrdersOfCustomer(Integer.parseInt("10"));
	}
	
	
	/**
	 * 功能 : 添加客户和订单信息
	
	 * 开发：zwwang 2015-3-14
	
	 */
	/*public static void addCustomerAndOrder() {
		Customer customer = new Customer("zhangsan", "123456", "张三", "青岛市", "13012345678");
		System.out.println("------------添加1条Customer记录-------------");
		addCustomer(customer);
		System.out.println("------------添加2条Order记录---------------");
		//创建id为1的Order对象
		OrderTest order = new OrderTest("1", new Date(), 42.8, customer);
		//把order对象数据保存到数据库中
		addOrder(order);
		order = new OrderTest("2", new Date(), 53.2d, customer);
		addOrder(order);
	}*/

	/**
	 * 功能 : 添加客户
	
	 * 开发：zwwang 2015-3-14
	
	 * @param customer
	 */
/*	public static void addCustomer(Customer customer) {
		//获取Session对象
		Session session = HibernateUtils.getSession();
		Configuration configuration = new Configuration();
		configuration.configure("/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		//开启事务
		Transaction trans = session.beginTransaction();
		//保存对象
		session.save(customer);
		//提交事务
		trans.commit();
		//关闭Session
		HibernateUtils.closeSession();
	}*/
	
	/**
	 * 功能 : 添加order对象
	
	 * 开发：zwwang 2015-3-14
	
	 * @param order
	 */
	/*public static void addOrder(OrderTest order) {
		//获取Session对象
		Configuration configuration = new Configuration();
		configuration.configure("/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(order);
		trans.commit();
		session.close();
	}*/
	
	/*public static void findOrder(int id) {
		//获取Session对象
		Configuration configuration = new Configuration();
		configuration.configure("/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		OrderTest orderTest = (OrderTest) session.get(OrderTest.class, id);
		//利用order获取Customer对象
		Customer customer = orderTest.getCustomer();
		System.out.println(orderTest.getId());
		System.out.println(customer.getRealName());
	}*/
	
	public static void findOrdersOfCustomer(Integer id) {
		/*//获取Session对象
		Configuration configuration = new Configuration();
		configuration.configure("/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		//根据id获取Customer对象
		Customer customer = (Customer) session.get(Customer.class, id);
		//获取Order集合
		Set<OrderTest> orders = customer.getOrderTests();
		//打印相关信息
		System.out.println("客户:" + customer.getUserName() + "的订单如下:");
		for (OrderTest orderTest : orders) {
			System.out.println(orderTest.getId());
		}*/
	}
}

