package com.bw.entity;

import java.math.BigDecimal;

public class Goods {
	private Integer id;
	private String name;
	private BigDecimal price;
	private Integer sales;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getSales() {
		return sales;
	}
	public void setSales(Integer sales) {
		this.sales = sales;
	}
	public Goods(Integer id, String name, BigDecimal price, Integer sales) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.sales = sales;
	}
	public Goods() {
		super();
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", sales=" + sales + "]";
	}
	
}
