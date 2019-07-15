package my.restaurant.controller;

import java.security.Principal;

import my.restaurant.entity.User;
import my.restaurant.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserRESTController {

//test class commit
	
//	@Autowired
//	private UserService userService;
//	
//	
//	@RequestMapping(method = RequestMethod.GET)
//	@ResponseBody
//	public String getUserProfile(@PathVariable("userId") String userId, Principal principal) {
//
//			userId = principal.getName();
//			int id = Integer.parseInt(userId);
//			User user = userService.getUser(id);
//			String name = user.getUsername();
//		
//		return name;
//	}
}
