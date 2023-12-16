package com.School.Entity;

public class Student {


	public void setId(int id) {
		this.id = id;
	}
	private int id;
	private String name;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile + ", country=" + country + "]";
	}
	private long mobile;
	private String country;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getMobile() {
		return mobile;
	}
	public String getCountry() {
		return country;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
