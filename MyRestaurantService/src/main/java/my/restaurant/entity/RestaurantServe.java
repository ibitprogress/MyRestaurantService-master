package my.restaurant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RestaurantServe {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	//@ManyToOne//(fetch = FetchType.LAZY)
	private String userId;
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurantServe")
//	private List<RestaurantTable> restaurantTables;

	private String serviceDate;
	
	private String serviceTime;
	//def
	private String tableNumber;

	
	public String getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



//	public List<RestaurantTable> getRestaurantTables() {
//		return restaurantTables;
//	}
//
//	public void setRestaurantTables(List<RestaurantTable> restaurantTables) {
//		this.restaurantTables = restaurantTables;
//	}

	@Override
	public String toString() {
		return "RestaurantServe [id=" + id +  "]";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(String tableNumber) {
		this.tableNumber = tableNumber;
	}

	public String getServiceTime() {
		return serviceTime;
	}

	public void setServiceTime(String serviceTime) {
		this.serviceTime = serviceTime;
	}
	
	
}
