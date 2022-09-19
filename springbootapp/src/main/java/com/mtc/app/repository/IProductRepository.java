package com.mtc.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mtc.app.entity.Product;


public interface IProductRepository extends JpaRepository<Product, Integer>{
	
	Product findByName(String name);
	Product findByPrice(Float price);
	@Query("select p from Product p where p.id> :pid and p.name like :pname")
	List<Product> findByNameAndId(@Param("pid")int id,@Param("pname")String name);
}
