package practicePackage2;

public abstract class AbstractClassEx {

	AbstractClassEx() {
		System.out.println("Constructor from the abstract class");
	}

	public void pageFooter() {
		System.out.println("Page footer -- Abstract class normal method");
	}

	public abstract void pageHeader();

	public abstract void pagetitle();

}
