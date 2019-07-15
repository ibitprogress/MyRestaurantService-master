package my.restaurant.repository;

import org.springframework.data.repository.CrudRepository;

import my.restaurant.entity.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer>{

}
