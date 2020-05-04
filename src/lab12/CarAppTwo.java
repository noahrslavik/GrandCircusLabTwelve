package lab12;

import java.util.ArrayList;
import java.util.Scanner;

public class CarAppTwo {
	static ArrayList<Car> cars = new ArrayList<Car>();

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		Car audi = new Car("Audi", "A4", 2012, 20000.00);
		Car bmw = new Car("BMW", "3 Series", 2012, 20000.00);
		Car ford = new Car("Ford", "Fiesta", 2012, 20000.00);
		UsedCar chevy = new UsedCar("Chevy", "Tahoe", 2012, 6000.99, 150000.00);
		UsedCar lincoln = new UsedCar("Navigator", "A4", 2010, 26000.00, 140000.52);
		UsedCar toyota = new UsedCar("Toyota", "Prius", 2007, 1000.99, 167000.44);

		cars.add(audi);
		cars.add(bmw);
		cars.add(ford);
		cars.add(chevy);
		cars.add(lincoln);
		cars.add(toyota);
		int carChoice;
		printTable();
		do {
			carChoice = ValidatorHelper.getInt(kbd, "Which car would you like: ");
			if (carChoice != cars.size() + 1) {
				System.out.println(cars.get(carChoice - 1));
			} else {
				break;
			}
			if (ValidatorHelper.getYesNo(kbd, "Would you like to buy this car?")) {
				System.out.println("Excellent are finance department will be in touch shortly");
				cars.remove(carChoice - 1);
			}
			printTable();
		} while (carChoice != cars.size() + 1);

		System.out.println("Have a great day!");
	}

	public static void printTable() {
		for (int i = 1; i < cars.size() + 1; i++) {
			System.out.println(i + " " + cars.get(i - 1));
		}
		System.out.println(cars.size() + 1 + " Quit");
	}

}