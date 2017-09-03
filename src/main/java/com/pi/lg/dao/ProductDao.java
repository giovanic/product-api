package com.pi.lg.dao;

import java.util.ArrayList;
import java.util.List;

import com.pi.lg.model.Product;

public class ProductDao {
	private static final List<Product> productList = new ArrayList<>();

	static void init() {
		productList.add(new Product(productList.size(), "Coxinha", "Salgado frito", 3.50));
		productList.add(new Product(productList.size(), "Pastel", "Pastel de frango", 3.00));
		productList.add(new Product(productList.size(), "Pizza", "Pizza de 4 queijos", 22.50));
		productList.add(new Product(productList.size(), "Pão", "Pão de forma", 5.50));
		productList.add(new Product(productList.size(), "Bolacha", "Bolacha de chocolate", 2.50));
	}

	static {
		init();
	}

	public List<Product> getProductList() {
		return this.productList;
	}

	public void addProduct(Product product) {
		this.productList.add(product);
	}

	public Product removeProduct(int id) {
		for (Product product : productList) {
			if(product.getId() == id) {
				productList.remove(product);
				return product;
			}
			
		}
		return null;
	}
	
	public  List<Product> findProduct(String value) {
		value = value.toLowerCase();
		List<Product> newProductList = new ArrayList<>();
		for(Product product : productList) {
			if(product.getName().toLowerCase().contains(value) || product.getDesc().toLowerCase().contains(value)){
				newProductList.add(product) ;
			}
		}
		return newProductList;
		
	}
}








