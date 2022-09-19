package com.mtc.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mtc.app.entity.Product;

@Repository("productDAO")
public class ProductDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	@Autowired
//	private RowMapper<Product> rowMapper;
	
	private String selectQuery = "select * from test.product where id=?";
	private String selectAllQuery = "select * from test.product";
	private String insertQuery = "insert into product(id, name, price, quantity, description) values(?,?,?,?,?)";
	private String updateQuery = "update test.product set name=?,price=?,quantity=?,description=? where id=?";
	private String deleteQuery = "delete from test.product where id=?";
	
//	@Override
//	public Product findById(int prodId) {
//		Product product = jdbcTemplate.queryForObject(selectQuery, rowMapper, prodId);
//		return product;
//	}
//
//	@Override
//	public List<Product> allProducts() {
//		List<Product> allProds= jdbcTemplate.query(selectAllQuery, rowMapper);
//		return allProds;
//	}
//
//	@Override
//	public void addProduct(Product product) {
//		int i = jdbcTemplate.update(insertQuery, product.getId(),product.getName(),product.getPrice(),product.getQuantity(),product.getDescription());
//		System.out.println(i+" rows inserted");
//	}
//
//	@Override
//	public void updateProduct(Product product) {
//		int row = jdbcTemplate.update(updateQuery,product.getName(),product.getPrice(),product.getQuantity(),product.getDescription(),product.getId());
//		System.out.println(row+" row updated");
//	}
//
//	@Override
//	public void deleteProduct(int id) {
//		int delete = jdbcTemplate.update(deleteQuery, id);
//	}

		

}
