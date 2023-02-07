package com.everis.bootcamp.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.bootcamp.productservice.dto.Product;
import com.everis.bootcamp.productservice.service.ProductServiceI;

import io.github.resilience4j.retry.annotation.Retry;

@RestController("api")
public class ProductController {

	private ProductServiceI productService;
	
	public ProductController(ProductServiceI productService) {
		this.productService = productService;
	}

	
	@GetMapping("/product/{id}")
	@Retry(name = "price-service", fallbackMethod = "fallBack")
	public Product getProduct(@PathVariable String id) {
		return productService.get(id);
	}
	
	@Retry(name = "price-service", fallbackMethod = "fallBack")
	@PostMapping("/post")
	public Product postProduct(@PathVariable(value = "id") String id) {
		return productService.post(id);
	}

	public Product fallBack(String id, Throwable a) {
		Product product = new Product();
		product.setProductId("None");
		product.setChannel("None");
		product.setServerPort("None");
		return product;
		}

}
