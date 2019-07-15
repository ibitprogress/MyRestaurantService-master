package my.restaurant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import my.restaurant.entity.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer>{

	
	@Query("select c from Category c")
	List<Category> findAllCategory();
	
	@Query("UPDATE Category c SET c.name = :name, c.description = :description")
	Category updateCategory(@Param(value ="name") String name, @Param(value ="description") String description);
	
//	@Query("select c.name, c.description, p.name, p.description, p.price from Category c join c.products p on c.id=p.category.id")
//	List<Category> showMenu();
}
