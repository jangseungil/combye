package com.ctart.app.auth.vo;

public class AuthVo {
	private long seq;

	private String id;
	
	private String name;
	
	private String pass;

	public AuthVo() {
	}
	
	public AuthVo(String id) {
		this.id = id;
	}
	
	public long getSeq() {
		return seq;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
