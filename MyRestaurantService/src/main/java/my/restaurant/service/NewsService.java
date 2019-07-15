package my.restaurant.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import my.restaurant.entity.News;
import my.restaurant.repository.NewsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsService {

	@Autowired
	private NewsRepository newsRepository;
	
	
	public News createNews(News news){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		news.setCreateNewsDate(dateFormat.format(date));
		return newsRepository.save(news);
	}
	
	public List<News> getAllNews(){
		/*
		 * Page<News> page = newsRepos.findAll(new PageRequest(1, 10);
		 * List<News> list = page.getContent();
		 * 
		 * */
		return newsRepository.getAllNews();
	}
	
	
	
}
