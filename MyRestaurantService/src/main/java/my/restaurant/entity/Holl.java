package my.restaurant.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Holl {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	private String hollType;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "holl")
	private List<RestaurantTable> restaurantTables;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHollType() {
		return hollType;
	}

	public void setHollType(String hollType) {
		this.hollType = hollType;
	}

	public List<RestaurantTable> getRestaurantTables() {
		return restaurantTables;
	}

	public void setRestaurantTables(List<RestaurantTable> restaurantTables) {
		this.restaurantTables = restaurantTables;
	}

	@Override
	public String toString() {
		return "Holl [id=" + id + ", hollType=" + hollType + ", restaurantTables=" + restaurantTables + "]";
	}
	
	
	
}
