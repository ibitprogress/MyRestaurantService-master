package my.restaurant.service.editor;

import java.beans.PropertyEditorSupport;

import my.restaurant.entity.Product;
import my.restaurant.service.ProductService;

public class ProductEditor extends PropertyEditorSupport{
	
	private final ProductService productService;

	public ProductEditor(ProductService productService) {
		this.productService = productService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Product product = productService.getById(Integer.parseInt(text));
		setValue(product);
	}
	
	

	
	
}
