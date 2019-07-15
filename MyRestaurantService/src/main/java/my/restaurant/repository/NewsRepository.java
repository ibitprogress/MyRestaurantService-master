package my.restaurant.repository;

import java.util.List;

import my.restaurant.entity.News;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepository extends CrudRepository<News, Integer>{

	@Query("select n from News n")
	List<News> getAllNews();
}
