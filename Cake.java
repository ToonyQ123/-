package com.qf.bean;

public class Cake {
	private int id;//编号
	private String name;//名称
	private double price;//价格
	private String dep;//描述
	private String img;//图片
	public Cake() {
		super();
	}
	public Cake(int id, String name, double price, String dep, String img) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.dep = dep;
		this.img = img;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "Cake [id=" + id + ", name=" + name + ", price=" + price
				+ ", dec=" + dep + ", img=" + img + "]";
	}
	
}
