package com.mtc.app.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.mtc.app.dto.ProductDTO;

public interface IProductService {
	
	ProductDTO findById(int id);
	ProductDTO save(ProductDTO productDTO);
	ProductDTO findByName(String name);
	ProductDTO findByPrice(Float price);
	List<ProductDTO> findByNameAndId(@Param("pid")int id,@Param("pname")String name);
}
