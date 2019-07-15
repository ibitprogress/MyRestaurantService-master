package my.restaurant.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import my.restaurant.entity.Category;
import my.restaurant.service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "/admin/category/categoryCreate")
	public String createCategoryShowForm(Model model) {
		model.addAttribute("category", new Category());
		return "admin/category/categoryCreate";
	}

	@RequestMapping(value = "/admin/category/categoryCreate", method = RequestMethod.POST)
	public String createCategory(@ModelAttribute("category") @Valid Category category, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "admin/error";
		}
		categoryService.saveCategory(category);
		return "redirect:/admin/controll";
	}
	
	@RequestMapping(value = "/admin/category/{categoryId}/edit", method = RequestMethod.GET)
	public String editCategory(@PathVariable("categoryId") String categoryId, Model model){			
		int id = Integer.parseInt(categoryId);
		Category category = categoryService.getCategory(id);
		model.addAttribute("category", category);
		return "admin/category/categoryEdit";
	}
	
	@RequestMapping(value = "/admin/category/{categoryId}/edit", method = RequestMethod.POST)
	public String editCategorySave(@ModelAttribute("category") Category category, BindingResult bindingResult){		
		//dodaty validatsiu
	
		categoryService.saveCategory(category);
		return "redirect:/admin/controll";
	}

	@RequestMapping(value = "/admin/category/{categoryId}/delete", method = RequestMethod.GET)
	public String deleteCategory(@PathVariable("categoryId") String categoryId, Model model){			
		int id = Integer.parseInt(categoryId);
	//	Category category = categoryService.getCategory(id);
		categoryService.deleteCategory(id);
		return "admin/category/deleteSuccess";
	}
	
}
