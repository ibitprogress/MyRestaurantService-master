package my.restaurant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import my.restaurant.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	@Query("select p from Product p")
	List<Product> findAllProduct();

}
