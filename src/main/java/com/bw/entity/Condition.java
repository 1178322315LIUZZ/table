package com.bw.entity;

public class Condition {
	private Integer p1;
	private Integer p2;
	private Integer sale;
	private String method;
	private String type;
	public Integer getP1() {
		return p1;
	}
	public void setP1(Integer p1) {
		this.p1 = p1;
	}
	public Integer getP2() {
		return p2;
	}
	public void setP2(Integer p2) {
		this.p2 = p2;
	}
	public Integer getSale() {
		return sale;
	}
	public void setSale(Integer sale) {
		this.sale = sale;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Condition(Integer p1, Integer p2, Integer sale, String method, String type) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.sale = sale;
		this.method = method;
		this.type = type;
	}
	public Condition() {
		super();
	}
	@Override
	public String toString() {
		return "Condition [p1=" + p1 + ", p2=" + p2 + ", sale=" + sale + ", method=" + method + ", type=" + type + "]";
	}
	
}
