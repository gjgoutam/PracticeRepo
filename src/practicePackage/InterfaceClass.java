package practicePackage;

public class InterfaceClass extends InheritanceExParent implements Interface1,Interface2 {

	// all methods of the interfaces should be implemented here. The method definitions are added here. 
	// all methods of the Interface should be added here. 
	// non overridden methods can also be added when interfaces are inherited. 
	
	
	@Override
	public void Interface1method1() {
		// TODO Auto-generated method stub
		System.out.println("Interface1method1");
	}

	@Override
	public void Interface1method2() {
		// TODO Auto-generated method stub
		System.out.println("Interface1method2");
	}

	public void InterfaceClassMethod() {
		System.out.println("InterfaceClassMethod1");
	}
	
	@Override
	public void Interface2method1() {
		// TODO Auto-generated method stub
		System.out.println("Interface2method1");
	}

	@Override
	public void Interface2method2() {
		// TODO Auto-generated method stub
		System.out.println("Interface2method2");
	}

}
