package practicePackage;

public class InheritanceExChild1 extends InheritanceExParent {

	
	public void bmw() {
		System.out.println("BMW car");
	}

	@Override //added when method is overridden, optional but good practice
	public void stop() {
		System.out.println("BMW stop"); // Overriding stop from parent to child
	}
	
	public void sunroof() {
		System.out.println("BMW sunroof");
	}

	public static void main(String[] args) {
		InheritanceExChild1 carObj1 = new InheritanceExChild1();
		carObj1.start(); // from parent
		carObj1.bmw();  // from child
		carObj1.stop(); // from child
		carObj1.refuel(); // from parent
		carObj1.vehiclereg(); // from grandparent
		
		InheritanceExParent carObj2 = new InheritanceExParent();
		carObj2.start();
		carObj2.stop();
		carObj2.refuel();
		
		// Top casting
		
		InheritanceExParent carObj3 = new InheritanceExChild1();
		carObj3.start();
		carObj3.stop();
		carObj3.vehiclereg();
		
		
	}
}
