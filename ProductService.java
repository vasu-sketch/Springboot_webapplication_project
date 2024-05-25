package com.example.ProductSpringweb;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




@Component
public class ProductService {
	
	@Autowired
	ProductDB db;
	
	
	public void show() {
		
		System.out.println("creating the object");
	}
	
	
//	
//	ProductDB db = new ProductDB();
//	
	public void addProduct(Product p) {
		
		db.save(p);
		
		
	}
//	
	public List<Product> getallProducts(){
		
		return db.findAll();
		
	}
	
	public Product getproductbyName(String name){
		
		return db.findByName(name);
		
	}
	
}