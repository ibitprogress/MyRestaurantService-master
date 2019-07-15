package my.restaurant.repository;

import org.springframework.data.repository.CrudRepository;

import my.restaurant.entity.RestaurantTable;

public interface RestaurantTableRepository extends CrudRepository<RestaurantTable, Integer>{

}
