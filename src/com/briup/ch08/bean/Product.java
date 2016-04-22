package com.briup.ch08.bean;

public class Product {
	private Long id;
	private String name;
	private Integer price;
	private String productPlace;
	public Product(){
		
	}
	public Product(String name,Integer price,String productPlace){
		super();
		this.setName(name);
		this.setPrice(price);
		this.setProductPlace(productPlace);
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getProductPlace() {
		return productPlace;
	}
	public void setProductPlace(String productPlace) {
		this.productPlace = productPlace;
	}
	

}
