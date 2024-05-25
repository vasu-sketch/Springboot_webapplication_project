package com.example.ProductSpringweb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/products")
	public List<Product> getallProduct(){
		
		return service.getallProducts();
	}
	
	@GetMapping("/product/{name}")
	public  Product getProduct(@PathVariable String name){
		
		return service.getproductbyName(name);
	}
	
	
	@PostMapping("/product")
	public void addProduct(@RequestBody Product p) {
		
		service.addProduct(p);
	}

}
