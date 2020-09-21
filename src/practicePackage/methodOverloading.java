package practicePackage;

public class methodOverloading {

	public void login(String socialMedia) {
		System.out.println("String socialMedia");
	}

	public void login(String usrname, String pwd) {
		System.out.println("String usrname, String pwd");
	}

	public void login(Long phNumber, int otp) {
		System.out.println("Long phNumber "+phNumber+" int otp");
	}

	public void login(String usrname, String pwd, String role) {
		System.out.println("String usrname, String pwd, String role");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// method overloading, same name methods with different parameters, different
		// number of parameters or different sequence of parameters.
		// it should be within same class
		// its also called compile time polymorphism

		methodOverloading MoL = new methodOverloading();
		MoL.login("String");
		long phNum = 9663744808L;
		MoL.login(phNum, 3245);
		MoL.login("String", "Goutam");
		MoL.login("usrname", "pwd", "role");

	}

}
