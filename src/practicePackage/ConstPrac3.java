package practicePackage;

public class ConstPrac3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstPrac2 cred = new ConstPrac2("a@b.com","pwd");
		cred.getPassword();
		cred.getUsername();
		cred.doLogin(cred.getUsername(), cred.getPassword());
	}
}
