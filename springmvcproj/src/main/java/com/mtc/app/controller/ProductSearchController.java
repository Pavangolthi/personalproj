package com.mtc.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mtc.app.dao.IProductDao;
import com.mtc.app.entity.Product;

@Controller
public class ProductSearchController {
	
	@Autowired
	private IProductDao productDAO;
	
	@RequestMapping("/productsearch")
	public ModelAndView searchProduct(HttpServletRequest request) {
		int pid = Integer.parseInt(request.getParameter("productId"));
		System.out.println(pid);
		Product product = productDAO.findById(pid);
		ModelAndView modelAndView = new ModelAndView("sampleView");
		modelAndView.addObject("product", product);
		return modelAndView;
	}
	
	//Using model object
	@RequestMapping("/allproducts")
	public String getAllProducts(Model model) {
		List<Product> prodList = productDAO.allProducts();
		model.addAttribute("allproducts",prodList);		
		//view name
		//return "allproducts";
		return "productPDFView";
	}
	
	/*
	 * @RequestMapping("/allproducts") public ModelAndView
	 * getAllProducts(HttpServletRequest request) { List<Product> prodList =
	 * productDAO.allProducts(); ModelAndView modelAndView = new
	 * ModelAndView("allproducts"); modelAndView.addObject("allproducts", prodList);
	 * return modelAndView; }
	 */}
