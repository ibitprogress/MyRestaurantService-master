package my.restaurant.controller;

import my.restaurant.service.CategoryService;
import my.restaurant.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/menu")
	public String showMenu(Model model){
		model.addAttribute("categories", categoryService.findAllCategory());
		model.addAttribute("products", productService.findAllProduct());		
		return "menu";
	}
	
	
}
