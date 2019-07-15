package my.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String goToLoginPage(Model model){
		return "login";
	}
	
}
