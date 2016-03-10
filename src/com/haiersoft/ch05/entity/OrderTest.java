package com.haiersoft.ch05.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderTest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//主键Id
	private Integer id;
	//订单编号
	private String orderNo;
	//下单日期
	private Date date;
	//总金额
	private Double total;
	//关联客户
	private Customer customer;
	
	public OrderTest() {
		super();
	}

	public OrderTest(String orderNo, Date date, Double total, Customer customer) {
		super();
		this.orderNo  = orderNo;
		this.date = date;
		this.total = total;
		this.customer = customer;
	}
	/*根据id重写hasCode()方法*/
	public int hasCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	/*根据id重新equals()方法*/
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		OrderTest other = (OrderTest) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
