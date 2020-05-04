package lab12;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
static ArrayList<Car> cars = new ArrayList<Car>();
public static void main(String[] args) {
Scanner kbd = new Scanner(System.in);
int numberOfCars = ValidatorHelper.getInt(kbd, "Enter the number of vehicles you'd like to enter: ");

for(int i = 0; i < numberOfCars; i++) {
	String make = ValidatorHelper.getString(kbd, "Enter the make of the car: ");
	String model = ValidatorHelper.getString(kbd, "Enter the model of the car: ");
	int year = ValidatorHelper.getInt(kbd, "Enter the year of the car: ");
	double price = ValidatorHelper.getDouble(kbd, "Enter the price of the car: ");
	
	Car carToAdd = new Car(make,model,year,price);
	cars.add(carToAdd);
}
System.out.println("Current Inventory:");
System.out.println(cars);

}
}

