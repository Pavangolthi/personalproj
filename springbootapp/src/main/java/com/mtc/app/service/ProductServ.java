package com.mtc.app.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mtc.app.dto.ProductDTO;
import com.mtc.app.entity.Product;
import com.mtc.app.repository.IProductRepository;

@Repository
public class ProductServ implements IProductService{
	
	@Autowired
	private IProductRepository productRepository;

	@Override
	public ProductDTO save(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO findByName(String name) {
		Product product = productRepository.findByName(name);
		System.out.println(product);
		ProductDTO productDTO = new ProductDTO();
		BeanUtils.copyProperties(product, productDTO);
		return null;
	}

	@Override
	public ProductDTO findByPrice(Float price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDTO> findByNameAndId(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO findById(int id) {
		Product product = productRepository.findById(id).get();
		System.out.println(product);
		ProductDTO dto = new ProductDTO();
		BeanUtils.copyProperties(product, dto);
		return dto;
	}

}
