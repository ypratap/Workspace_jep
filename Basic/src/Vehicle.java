import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Super class


public class Vehicle {


	private int wheelsCount;
	private int seats = 2;

	
	
	enum vehicleType {
		Electric, Petrol, Diesel, Coal
	};
	
	
	public int getWheelsCount() {
		return wheelsCount;
	}

	public void setWheelsCount(int wheelsCount) {
		this.wheelsCount = wheelsCount;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "Vehicle [wheelsCount=" + wheelsCount + ", seats=" + seats + ", getWheelsCount()=" + getWheelsCount()
				+ ", getSeats()=" + getSeats() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", this toString()=" + this.toString() + ", super toString()=" + super.toString() + "]";
	}
	 
}