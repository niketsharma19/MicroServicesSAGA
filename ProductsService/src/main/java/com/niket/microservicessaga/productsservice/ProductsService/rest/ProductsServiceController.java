package com.niket.microservicessaga.productsservice.ProductsService.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsServiceController {
	
	@GetMapping("/get")
	public String getMethod() {
		return "Products Service";
	}

}
