package my.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import my.restaurant.entity.Category;
import my.restaurant.entity.Product;
import my.restaurant.service.CategoryService;
import my.restaurant.service.ProductService;
import my.restaurant.service.editor.CategoryEditor;
import my.restaurant.service.editor.ProductEditor;

@Controller
public class ProductController {

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ProductService productService;

	@InitBinder
	protected void initBinder(WebDataBinder dataBinder) {
		dataBinder.registerCustomEditor(Product.class, new ProductEditor(productService));
		dataBinder.registerCustomEditor(Category.class, new CategoryEditor(categoryService));
		
	}

	@RequestMapping(value = "/admin/product/createProduct")
	public String showCreateProductsForf(Model model, Category category) {
		model.addAttribute("product", new Product());
		List<Category> catList = categoryService.findAllCategory();
		model.addAttribute("categories", catList);
		return "admin/product/createProduct";
	}

	@RequestMapping(value = "/admin/product/createProduct", method = RequestMethod.POST)
	public String createProductsForm(@ModelAttribute("product") Product product, BindingResult bindingResult) {
		// if(bindingResult.hasErrors()){
		//
		// }
		productService.saveProduct(product);
		return "redirect:/admin/controll";
	}
	
	
	//------------------- dorobyty
	@RequestMapping(value = "/admin/product/{productId}/editProduct", method = RequestMethod.GET)
	public String editProductForm(@PathVariable("productId") String productId, Model model){
		
		return "";
	}
	
	@RequestMapping(value = "/admin/product/{productId}/editProduct", method = RequestMethod.POST)
	public String editProductFormPOst(@ModelAttribute("product") Product product, BindingResult bindingResult){
		
		return "";
	}
}
