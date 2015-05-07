package com.ctart.app.test.user.vo;


public class UserTestVo {

	private long seq;

	private String type;
	
	private String name;
	
	private String sex;
	
	private String birth;
	
	private String phone;

	private String zipcode;
	
	private String address;
	
	private String regDate;
	
	private String cnfYn;
	
	private String leaveYn;
	
	public UserTestVo() {
	}
	
	public UserTestVo(long seq) {
		this.seq = seq;
	}

	public long getSeq() {
		return seq;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getCnfYn() {
		return cnfYn;
	}

	public void setCnfYn(String cnfYn) {
		this.cnfYn = cnfYn;
	}

	public String getLeaveYn() {
		return leaveYn;
	}

	public void setLeaveYn(String leaveYn) {
		this.leaveYn = leaveYn;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
