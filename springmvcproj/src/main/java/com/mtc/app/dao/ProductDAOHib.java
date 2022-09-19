package com.mtc.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.mtc.app.entity.Product;

@Primary
@Repository("productDAOHib")
public class ProductDAOHib implements IProductDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public Product findById(int prodId) {
		Session session = sessionFactory.openSession();
		Product product = session.get(Product.class, prodId);
		return product;
	}

	@Override
	public List<Product> allProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		
	}

	

	
}
