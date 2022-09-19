package com.mtc.app.dao;

import java.util.List;

import com.mtc.app.bo.Product;

public interface IProductDAO {
	
	Product findById(int id);
	List<Product> findAll();
	
}
