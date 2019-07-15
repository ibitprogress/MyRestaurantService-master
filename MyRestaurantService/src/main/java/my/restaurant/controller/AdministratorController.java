package my.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import my.restaurant.entity.Category;
import my.restaurant.service.CategoryService;
import my.restaurant.service.ProductService;

@Controller
public class AdministratorController {

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/admin/controll")
	public String showAdminControllPage(Model model, Category category){
		model.addAttribute("category", categoryService.findAllCategory());
		model.addAttribute("product", productService.findAllProduct());
		return "admin/controll";
	}
	
	
	
//	@ModelAttribute("allCategories")
//	public Iterable<Category> fetchAllCategories() {
//		return categoryService.findAllCategory();
//	}
	
	
}
