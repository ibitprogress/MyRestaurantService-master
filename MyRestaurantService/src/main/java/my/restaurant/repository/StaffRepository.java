package my.restaurant.repository;

import org.springframework.data.repository.CrudRepository;

import my.restaurant.entity.Staff;

public interface StaffRepository extends CrudRepository<Staff, Integer>{

}
