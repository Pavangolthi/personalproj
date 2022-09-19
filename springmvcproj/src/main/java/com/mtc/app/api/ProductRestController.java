package com.mtc.app.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtc.app.dao.IProductDao;
import com.mtc.app.entity.Product;

@RequestMapping("/products")
@RestController
public class ProductRestController {
	
	//Logger logger = LoggerFactory.getLogger(ProductRestController.class);
	
	@Qualifier("productDAOHib")
	@Autowired
	private IProductDao productDAO;
	
	@GetMapping(path = "/{id}", produces="application/json")
	public Product findById(@PathVariable("id") int id) {
		//logger.info("***findById()***");
		Product product = productDAO.findById(id);
		return product;
	}
	
//	@GetMapping
//	public List<Product> addProduct() {
//		return productDAO.allProducts();
//	}
	
	@PutMapping(consumes="application/xml",produces="application/xml")
	public Product addProduct(@RequestBody Product product) {
		productDAO.addProduct(product);
		return product;
	}
	
	@PostMapping(consumes="application/xml",produces="application/xml")
	public Product updateProduct(@RequestBody Product product) {
		productDAO.updateProduct(product);
		return product;
	}
	
	@DeleteMapping(path="/{id}",consumes="application/xml")
	public void deleteProduct(@PathVariable("id") int id) {
		productDAO.deleteProduct(id);
	}
}
