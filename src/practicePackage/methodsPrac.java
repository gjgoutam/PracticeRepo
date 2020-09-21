package practicePackage;


// static and non static variables and methods
// In this example taking car as example, common property is wheels is 4. this will be the static variable
// Common method across, cars is engine start. this will be the static method. 

public class methodsPrac {
// Class variables
	String companyName; 
	String modelName;
	double price;
	String color;
	static final int wheels = 4; // this variable is static, hence shared in all objects, and its final, final keyword is used 
								 // to make the value constant.
	
	public static final void startCar(String carStart) {
		System.out.println(carStart+" started");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating object for car1 Audi
		
		methodsPrac car1 = new methodsPrac();
		car1.companyName = "Audi";
		car1.modelName = "A6";
		car1.price = 6830300.66;
		car1.color = "White";
		System.out.println(methodsPrac.wheels); // this is how static class variables are called.
		methodsPrac.startCar(car1.modelName);	// this is how static methods are called. 
		
		// Essentially static is used when the objects of a class have a common constant value when need not be declared in each instance. 
		// In this example, all cars have 4 wheels, so by declaring it as static whenever we need the value of wheels, its called directly from the class variable. 
		// similarly all cars start, hence when the method is called a common method is called.
	
	}

}
