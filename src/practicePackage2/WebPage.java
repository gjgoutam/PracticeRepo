package practicePackage2;

public class WebPage extends AbstractClassEx{

	WebPage(){
		System.out.println("Constructor from Child class");
	}
	@Override
	public void pageHeader() {
		// TODO Auto-generated method stub
		System.out.println("Webpage pageheader --- overridden method");
	}

	@Override
	public void pagetitle() {
		// TODO Auto-generated method stub
		System.out.println("Webpage pagetitle --- overridden method");
		
	}
	
	public void doLogin(String usrname, String pwd) {
		System.out.println("User name is "+usrname+" and the pwd is "+pwd);
	}
	
}
