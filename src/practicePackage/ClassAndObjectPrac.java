package practicePackage;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassAndObjectPrac {
	// Class variables or class data members

	String car;
	String company;
	String model;
	int bhp;
	String serviceCenters[];
	ArrayList<Integer> YearsOfOwnership;
	HashMap<String, String> battery;
	static int wheels = 4; // To fix a value
	static String fuel = "Petrol";

	// Simple method without any return type
	public void rating(String carModel) {
		if (carModel == "Spark") {
			System.out.println("Rating is 2");
			System.out.println("Car Owner is "+ owner(carModel)); // calling method inside a method
		}
		else if (carModel == "Elite i20") {
			System.out.println("Rating is 3");
			System.out.println("Car Owner is "+ owner(carModel));
		}
		else if (carModel == "City") {
			System.out.println("Rating is 1");
			System.out.println("Car Owner is "+ owner(carModel));
		}
		else
			System.out.println("Invalid car model passed.");

	}
	
	// Method with string return type
	public String owner(String carModel) {
		String owner = " ";
		if (carModel.equals("Spark"))
			owner = "Ganapati Joshi";
		else if (carModel == "Elite i20")
			owner = "Ganapati Joshi";
		else if (carModel == "City")
			owner = "Goutam Joshi";
		else if (carModel == "Grand i10")
			owner = "Sharmita Bose";
		else
			System.out.println("Invalid car model passed.");

		return owner;
	}

	public static void main(String[] args) {

		// 3 objects created of the class ClassAndObjectPrac
		ClassAndObjectPrac car1 = new ClassAndObjectPrac();
		car1.car = "First";
		car1.company = "Chevrolet";
		car1.model = "Spark";
		car1.bhp = 63;
		car1.serviceCenters = new String[3];
		car1.serviceCenters[0] = "Sundaram";
		car1.serviceCenters[1] = "Trident";
		car1.serviceCenters[2] = "Mudra Bosch";
		System.out.println(car1.car + " " + car1.company + " " + car1.model + " " + car1.bhp + "bhp");
		for (int i = 0; i < car1.serviceCenters.length; i++)
			System.out.println(car1.model + " Service center " + (i + 1) + " " + car1.serviceCenters[i]);
		car1.YearsOfOwnership = new ArrayList<Integer>();
		car1.YearsOfOwnership.add(1);
		car1.YearsOfOwnership.add(2);
		car1.YearsOfOwnership.add(3);
		car1.YearsOfOwnership.add(4);
		car1.YearsOfOwnership.add(5);
		car1.YearsOfOwnership.add(6);
		System.out.println("Total years of ownership " + car1.YearsOfOwnership);
		car1.battery = new HashMap<String, String>();
		car1.battery.put("Year 1 to Year 3", "Exide");
		car1.battery.put("Year 4 to Year 6", "Amaron");
		car1.battery.forEach((k, v) -> System.out.println(k + "  " + v));
		car1.rating(car1.model);
		System.out.println("__________________________________________________");

		ClassAndObjectPrac car2 = new ClassAndObjectPrac();
		car2.car = "Second";
		car2.company = "Hyundai";
		car2.model = "Elite i20";
		car2.bhp = 82;
		car2.serviceCenters = new String[2];
		car2.serviceCenters[0] = "Trident";
		car2.serviceCenters[1] = "Advaith";
		car2.YearsOfOwnership = new ArrayList<Integer>();
		car2.YearsOfOwnership.add(1);
		car2.YearsOfOwnership.add(2);
		car2.YearsOfOwnership.add(3);
		car2.YearsOfOwnership.add(4);
		System.out.println(car2.car + " " + car2.company + " " + car2.model + " " + car2.bhp);
		System.out.println(car2.serviceCenters[0]);
		System.out.println(car2.serviceCenters[1]);
		System.out.println("Total years of ownership " + car2.YearsOfOwnership);
		System.out.println(car2.fuel);
		car2.rating(car2.model);
		System.out.println("__________________________________________________");

		ClassAndObjectPrac car3 = new ClassAndObjectPrac();
		car3.car = "Third";
		car3.company = "Honda";
		car3.model = "City";
		car3.bhp = 117;

		// printing values
		System.out.println(car3.car);
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.bhp);
		System.out.println(car3.wheels);
		System.out.println("__________________________________________________");

		ClassAndObjectPrac car4 = new ClassAndObjectPrac();
		car4.car = "Fourth";
		car4.company = "Hyundai";
		car4.model = "Grand i10";
		car4.bhp = 82;
		car4.rating(car4.model);
		System.out.println("Owner is "+car4.owner(car4.model));
		System.out.println("__________________________________________________");
		
		// creating object from another method 
		ClassObjPrac2 futureCars = new ClassObjPrac2();
		futureCars.main(args);
		
		
	}
}
