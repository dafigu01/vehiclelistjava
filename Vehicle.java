public class Vehicle implements Comparable <Vehicle> {
	private String make;
	private String model;
	private double milespergallon;
	
	public Vehicle () {
		this.make = "";
		this.model = "";
		this.milespergallon = 0;
		
	}
	public Vehicle(String make, String model, double milespergallon) {
		this.make = make;
		this.model = model;
		this.milespergallon = milespergallon;
	}
	
	public String setMake() {
		return make;
	}
	public String setModel() {
		return model;
	}
	public double setMilesPerGallon() {
		return milespergallon;
	}
	
	@Override
	public int compareTo(Vehicle v) {
		int comparempg = (int)v.setMilesPerGallon();
		if (this.milespergallon > comparempg) {
			return 1;
		}
		else if (this.milespergallon == comparempg) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	@Override
	public String toString() {
		return "Make: " + setMake() + ", Model: " + setModel() + ", Mileage: " + setMilesPerGallon();
	}
	
	
	
}
	
