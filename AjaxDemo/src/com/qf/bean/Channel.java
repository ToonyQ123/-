package com.qf.bean;

public class Channel {
	//频道的编码
	private String code;
	//频道名称
	private String name;
	
	
	public Channel() {
		super();
	}
	public Channel(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
