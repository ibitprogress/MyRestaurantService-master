package my.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.restaurant.entity.Product;
import my.restaurant.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository  productRepository;
	
	public List<Product> findAllProduct(){
		return productRepository.findAllProduct();
	}
	
	public Product saveProduct(Product product){
		return productRepository.save(product);
	}
	
	public Product getById(int id){
		return productRepository.findOne(id);
	}
	
}
