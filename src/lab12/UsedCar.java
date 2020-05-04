package lab12;

public class UsedCar extends Car{

	private double mileage;
	
	public UsedCar(String makeIn, String modelIn, int yrIn, double priceIn,double miles) {
		super(makeIn,modelIn, yrIn, priceIn);
		mileage = miles;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return String.format("%-10s %-10s %-10d $%-10.2f (USED)%-10f\n", make, model, year, price, mileage);
	}



}
