package my.restaurant.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class News {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String newsName;
	
	private String description;
	
	private String createNewsDate;

	public String getCreateNewsDate() {
		return createNewsDate;
	}

	public void setCreateNewsDate(String createNewsDate) {
		this.createNewsDate = createNewsDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNewsName() {
		return newsName;
	}

	public void setNewsName(String newsName) {
		this.newsName = newsName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
	@Override
	public String toString() {
		return "News [id=" + id + ", newsName=" + newsName + ", description=" + description
				+ "]";
	}
	
}
