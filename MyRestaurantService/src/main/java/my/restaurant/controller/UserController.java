package my.restaurant.controller;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import my.restaurant.entity.User;
import my.restaurant.service.UserService;
import my.restaurant.service.validator.UserValidator;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@InitBinder
	protected void initBinder(WebDataBinder webDataBinder){
		webDataBinder.setValidator(new UserValidator(userService));
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String goToRegisterPage(Model model) {
		model.addAttribute("user", new User());
		return "user/register";
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(@ModelAttribute("user") @Valid User user, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "user/register";
		}
		userService.userSave(user);
		return "redirect:/user/regSuccess";
	}

	@RequestMapping("/user/regSuccess")
	public String registrSuccess() {
		return "user/regSuccess";
	}

	@RequestMapping(value = "/user/profile/{userId}", method = RequestMethod.GET)
	public String getUserProfile(@PathVariable("userId") String userId, Model model, Principal principal) {
		if (principal != null) {
			userId = principal.getName();
			int id = Integer.parseInt(userId);
			User user = userService.getUser(id);
			model.addAttribute("profile", user);
		}
		return "user/profile";
	}
	
	@RequestMapping(value = "/user/profile/{userId}/edit")
	public String editUserProfileGet(@PathVariable("userId") String userId, Model model, Principal principal){
		if (principal != null) {
			userId = principal.getName();
			int id = Integer.parseInt(userId);
			User user = userService.getUser(id);
			model.addAttribute("profile", user);
		}	
		return "user/edit";
	}
	
	@RequestMapping(value = "/user/profile/{userId}/edit", method = RequestMethod.POST)
	public String updateUserInfo(@ModelAttribute("profile") @Valid User user, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return "user/edit";
		}
		userService.userUpdateInfo(user);
		return "user/profile";
	}
	

}
