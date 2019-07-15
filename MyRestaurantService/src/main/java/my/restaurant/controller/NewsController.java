package my.restaurant.controller;

import my.restaurant.entity.News;
import my.restaurant.service.NewsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewsController {
	
	@Autowired
	private NewsService newsService;
	
	
	@RequestMapping(value = "/news", method = RequestMethod.GET)
	public String showNews(Model model){
		model.addAttribute("showFuturedNews", newsService.getAllNews());
		return "news";
	}
	
	@RequestMapping(value = "/admin/news/addNews", method = RequestMethod.GET)
	public String addNews(Model model){
		model.addAttribute("news", new News());
		return "admin/news/addNews";
	}
	
	@RequestMapping(value = "/admin/news/addNews", method = RequestMethod.POST)
	public String saveNews(@ModelAttribute("news") News news, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return "admin/error";
		}
		newsService.createNews(news);
		return "redirect:/news";
	}
	
	/*
	 * @PrePersist
	 * @PreUpdate
	 * publ void setLastAct(){
	 * this.setLastSignIn(new Date);
	 * */
	
}
