package my.restaurant.controller;

import my.restaurant.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	@RequestMapping(value = "/")
	public String showHomePage(Model model) {
		return "index";
	}

}
