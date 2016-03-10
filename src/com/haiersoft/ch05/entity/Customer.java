package com.haiersoft.ch05.entity;

import java.io.Serializable;

public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//用户ID
	private Integer id;
	//用户名
	private String userName;
	//密码
	private String password;
	//真实姓名
	private String realName;
	//收货人地址
	private String address;
	//手机号
	private String mobile;
	//身份证号码
//	private IdCard idCard;
	//订单集合 ordertest
//	private Set<OrderTest> orderTests = new HashSet<OrderTest>(0);

	public Customer() {
		
	};
	
	public Customer(String userName, String password, String realName,
			String address, String mobile) {
		super();
		this.userName = userName;
		this.password = password;
		this.realName = realName;
		this.address = address;
		this.mobile = mobile;
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
		Customer other = (Customer) obj;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/*public Set<OrderTest> getOrderTests() {
		return orderTests;
	}
	public void setOrderTests(Set<OrderTest> orderTests) {
		this.orderTests = orderTests;
	}
	public IdCard getIdCard() {
		return idCard;
	}
	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
	}*/
	
}
