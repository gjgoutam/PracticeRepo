package practicePackage;
// no main method, will call in ConstPrac3 class
public class ConstPrac2 {
	
	// setters and getters  
	
	String userName;
	String password;
	
	// whatever comes when the object is called to this constructor, those values are set to the class variables. hence setters
	ConstPrac2(String userName, String password){
		this.userName = userName;
		this.password = password;
	}

	public String getUsername() {
		return this.userName;
		
	}
	
	public String getPassword() {
		return this.password;
		
	}
	
	public void doLogin(String userName, String Password) {
		System.out.println("Logged in with "+userName+" "+Password);
	}
}
