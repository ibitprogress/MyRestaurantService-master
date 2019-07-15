package my.restaurant.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style="M-")
	private Calendar calendar;
	
	private String paymentMethod;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private RestaurantServe restaurantServe;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public RestaurantServe getRestaurantServe() {
		return restaurantServe;
	}

	public void setRestaurantServe(RestaurantServe restaurantServe) {
		this.restaurantServe = restaurantServe;
	}


	@Override
	public String toString() {
		return "Payment [id=" + id + ", calendar=" + calendar + ", paymentMethod=" + paymentMethod
				+ ", restaurantServe=" + restaurantServe + "]";
	}
	
}
