package com.product.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.demo.entity.Product;
import com.product.demo.repo.ProductRepository;

@Service
public class PrtoductServiceImpl implements ProductService{

	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> fetchAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public void saveProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public Product getProduct(String name) {
		Product product = productRepository.findByName(name);
		return product;
	}

}
