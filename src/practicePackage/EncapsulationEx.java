package practicePackage;

public class EncapsulationEx {

	String Browser;
	double version;
	private boolean cookies;
	
	EncapsulationEx(String Browser, double version, boolean cookies){
		this.Browser=Browser;
		this.version=version;
		this.cookies=cookies;
	}
	
	public void launchBrowser() {
		System.out.println("Initiating browser launch");
		checkHardwareCompatibilty();
		checkOSCompatibilty();
		System.out.println(Browser+ " version "+version+" Launched");
	}
	
	private void checkHardwareCompatibilty() {
		System.out.println("OS compatible");
	}
	
	private void checkOSCompatibilty() {
		System.out.println("Hardware compatible");
	}
	
	// this is encapsulation of cookies variable 
	public boolean getCookies() {
		return cookies;
	}
}
