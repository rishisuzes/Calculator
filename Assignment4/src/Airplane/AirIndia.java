package Airplane;

public class AirIndia implements Airfare {
	private int hours;
	private double costPerHours;
	
	
	public AirIndia(int hours, double costPerHouse) {
		this.hours = hours;
		this.costPerHours = costPerHours;
	}


	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}


	public double getCostPerHours() {
		return costPerHours;
	}


	public void setCostPerHours(double costPerHours) {
		this.costPerHours = costPerHours;
	}
	
	// override the airfare calculate amount method
	
	public Double calculateAmount() {
		
		return hours * costPerHours;
	}
	
	// override the display method 
	
	public void display() {
		System.out.printf("%.2f%n",calculateAmount());
	}
	
	
	
	
}
