package com.mtc.app.dao;

import java.util.List;

import com.mtc.app.entity.Product;

public interface IProductDao {
	public Product findById(int prodId);
	public List<Product> allProducts();
	public void addProduct(Product product);
	public void updateProduct(Product product);
	public void deleteProduct(int id);
}
