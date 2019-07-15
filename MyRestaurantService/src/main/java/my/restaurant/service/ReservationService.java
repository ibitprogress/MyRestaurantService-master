package my.restaurant.service;

import my.restaurant.entity.RestaurantServe;
import my.restaurant.entity.User;
import my.restaurant.repository.RestaurantServeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

	@Autowired
	private RestaurantServeRepository restaurantServeRepository;
	
	public RestaurantServe serveSave(RestaurantServe  restaurantServe, String userId){	
		
		restaurantServe.setUserId(userId);
		restaurantServe.setServiceTime(restaurantServe.getServiceTime() + ":00");
		return restaurantServeRepository.save(restaurantServe);
	}
	
}
