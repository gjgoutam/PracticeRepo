package practicePackage;

import java.util.ArrayList;

public class ClassObjPrac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassAndObjectPrac PracClassCall = new ClassAndObjectPrac(); 
		PracClassCall.car = "Hopfully next";
		PracClassCall.company = "BMW";
		PracClassCall.model = "328i";
		PracClassCall.bhp=240;
		System.out.println(PracClassCall.car+" "+PracClassCall.company+" "+PracClassCall.model+" "+PracClassCall.bhp+"bhp");
		PracClassCall.YearsOfOwnership = new ArrayList<Integer>();
		PracClassCall.YearsOfOwnership.add(1);
		System.out.println(PracClassCall.YearsOfOwnership);
		String abc;
		
	}

}
