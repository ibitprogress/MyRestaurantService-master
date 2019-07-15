package my.restaurant.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(min = 5, max = 20)
	private String firsName;
	
	@Size(min = 5, max = 20)
	private String lastName;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "staff")
	private List<RestaurantTable> restaurantTables = new ArrayList<RestaurantTable>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<RestaurantTable> getRestaurantTables() {
		return restaurantTables;
	}

	public void setRestaurantTables(List<RestaurantTable> restaurantTables) {
		this.restaurantTables = restaurantTables;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", firsName=" + firsName + ", lastName=" + lastName + ", restaurantTables="
				+ restaurantTables + "]";
	}
	
	
	
}
