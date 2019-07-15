package my.restaurant.controller;

import java.security.Principal;

import my.restaurant.entity.RestaurantServe;
import my.restaurant.entity.User;
import my.restaurant.service.ReservationService;
import my.restaurant.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/reservation", method = RequestMethod.GET)
	public String goReservation(Model model){
		model.addAttribute("reservation", new RestaurantServe());
		return "reservation";
	}
	
	@RequestMapping(value = "reservation", method = RequestMethod.POST)
	public String setReservationForUser(@ModelAttribute("reservation") RestaurantServe restaurantServe, BindingResult bindingResult, Model model, Principal principal){
		
		if(bindingResult.hasErrors()){
			return "/reservation";
		}
		
		if(principal != null){
			String userId = principal.getName();
			reservationService.serveSave(restaurantServe, userId);
		}
		//redirect
		return "reservSuccess";
	}
	
	
}
