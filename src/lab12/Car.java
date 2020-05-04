package lab12;

public class Car {

	protected String make;
	protected String model;
	protected int year;
	protected double price;
	
	//no arg constructor
	public Car(){
	}
	
	public Car(String makeIn, String modelIn, int yrIn, double priceIn) {
		make = makeIn;
		model = modelIn;
		year = yrIn;
		price = priceIn;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%-10s %-10s %-10d $%-10.2f\n", make, model, year, price);
	}
	
	
	
}
