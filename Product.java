package com.example.ProductSpringweb;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String type;
	private int warranty;
	private String place;
	
	
	public Product() {
		
	}
	
	public Product(int id,String name, String type, int warranty, String place) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.warranty = warranty;
		this.place = place;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	 @Override
	    public String toString() {
	        return "Product{" +
	        		 "id='" + id + '\'' +
	                "name='" + name + '\'' +
	                ", type='" + type + '\'' +
	                ", warranty=" + warranty +
	                ", place='" + place + '\'' +
	                '}';
	    }
	

}
