package my.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.restaurant.entity.Category;
import my.restaurant.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category saveCategory(Category category){
		return categoryRepository.save(category);
	}
	
	public Category getCategory(int id){
		return categoryRepository.findOne(id);
	}
	
	public List<Category> findAllCategory(){
		return categoryRepository.findAllCategory();
	}
	
	public Category updateCategory(Category category){
		
		return categoryRepository.updateCategory(category.getName(), category.getDescription()) ;
	}
	
	public void deleteCategory(int id){
		categoryRepository.delete(id);
	}
	
//	public List<Category> showOnMenu(){
//		return categoryRepository.showMenu();
//	}
}
