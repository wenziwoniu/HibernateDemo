package com.haiersoft.ch05.entity;

public class IdCard {
	//主键ID
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	//身份证编号
	private String cardNo;
	
}
