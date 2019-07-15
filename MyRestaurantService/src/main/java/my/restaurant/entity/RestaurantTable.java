package my.restaurant.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class RestaurantTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull
	private int tableNumber;

	@ManyToOne(fetch = FetchType.LAZY)
	private Staff staff;

	@ManyToOne(fetch = FetchType.LAZY)
	private Holl holl;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private RestaurantServe restaurantServe;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Holl getHoll() {
		return holl;
	}

	public void setHoll(Holl holl) {
		this.holl = holl;
	}

	public RestaurantServe getRestaurantServe() {
		return restaurantServe;
	}

	public void setRestaurantServe(RestaurantServe restaurantServe) {
		this.restaurantServe = restaurantServe;
	}

	@Override
	public String toString() {
		return "RestaurantTable [id=" + id + ", tableNumber=" + tableNumber + ", staff=" + staff + ", holl=" + holl
				+ ", restaurantServe=" + restaurantServe + "]";
	}
}
