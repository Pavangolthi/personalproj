package com.mtc.app.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtc.app.dto.ProductDTO;
import com.mtc.app.entity.Product;
import com.mtc.app.repository.IProductRepository;
import com.mtc.app.service.IProductService;

@RequestMapping("/products")
@RestController
public class ProductRestController {
	
	@Autowired
	private IProductService productService;
	
	@GetMapping("/{id}")
	public ProductDTO findById(@PathVariable("id")int id) {
		ProductDTO productDTO =  productService.findById(id);
		return productDTO;
	}
	
	@GetMapping
	public List<Product> findAll(){
		return null;
	}
	
	@GetMapping("pname/{name}")
	public ProductDTO findByName(@PathVariable("name")String name) {
		return productService.findByName(name);
	}
	
	@GetMapping("price/{price}")
	public Product findByPrice(@PathVariable("price")Float price){
		return null;
	}
	
	@GetMapping("/{id}/{name}")
	public List<Product> findByNameAndId(@PathVariable("id")int id,@PathVariable("name")String name){
		//return productRepository.findByNameAndId(id, name+"%");
		return null;
	}
	
//	@GetMapping("/page/{pageIndex}/{recordsPerPage}")
//	public List<Product> findAllByPage(@PathVariable("pageIndex")int pageIndex,@PathVariable("recordsPerPage")int recordsPerPage){
//		Pageable pageable = PageRequest.of(pageIndex, recordsPerPage);
//		return productRepository.findAll(pageable).getContent();
//	}
}
