package com.mybatisExercise.freakUsers.domain;

public class User {
	
	private Integer id;
	private String name;
	private Integer age;
	private String product;
	
	public User() {
		
		super();
		}
	public User(Integer id, String name, Integer age, String product) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.product = product;
	}
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", product=" + product + "]";
	}
	
	
	

}
