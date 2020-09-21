package practicePackage2;

public class WebPageImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebPage wpage = new WebPage();
		wpage.pageHeader();
		wpage.pagetitle();
		wpage.pageFooter();
		wpage.doLogin("usrname", "pwd");

		// Top casting of abstract class

		AbstractClassEx wpage2 = new WebPage();
		wpage2.pageFooter();
		wpage2.pageHeader();
		wpage2.pagetitle();
		// as wpage2 is topcasted, webpage method cannot be called thru the object
		// wpage2
		// wpage2.doLogin("usrname", "pwd");
	}

}
