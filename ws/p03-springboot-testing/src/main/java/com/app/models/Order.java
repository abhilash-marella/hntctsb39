package com.app.models;

public class Order {
	private int id;
	private String item;
	private double price;
	
	public Order() {
		super();
	}
	public Order(String item, double price) {
		super();
		this.item = item;
		this.price = price;
	}
	public Order(int id, String item, double price) {
		this(item, price);
		this.id = id;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", item=" + item + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
