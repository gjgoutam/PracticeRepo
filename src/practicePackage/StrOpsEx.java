package practicePackage;

public class StrOpsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "       eeeeeeeeee Still very early Days with not even 4 digiets on thee ODO eeeeee     ";
		System.out.println(str.length());
		System.out.println(str.charAt(6));

		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf("e", 8));
		System.out.println(str.indexOf("e", ((str.indexOf("e") + 1))));

		int pos = 5;
		int tempvar = 0;
		for (int i = 1; i <= pos; i++) {
			tempvar = str.indexOf("e", tempvar) + 1;
			if (i == pos) {
				System.out.println(tempvar);
				break;
			}
		}

		System.out.println(str.indexOf("days"));
		System.out.println(str.indexOf("Hello")); // output will be -1 as the string is not present in str

		if (str.indexOf("x") >= 1) {
			System.out.println("X is present in the string");
		} else {
			System.out.println("X is not present in the string");
		}
		
		String str1 = str.trim(); // this removes the empty spaces at the starting and ending of the string
		System.out.println(str1);
		
		// to remove/ replace all spaces in the string
		System.out.println(str.replace(" ",""));
		
		// Upper case and lowercase
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		
		// Concatenation 
		String a = "Goutam ";
		String b = "Joshi";
		
		System.out.println(a+b);
		System.out.println(a.concat(b));
		
		// Contains
		
		if(str.contains("odo"))  // contains is case sensitive
			System.out.println("String contains odo");
		else
			System.out.println("String doesnt contain odo");
	
		// equals
		
		if(a.equals("Goutam ")) // Equals is case sensitive
			System.out.println("Launch Goutam");
		
		if(a.equalsIgnoreCase("GOUTAM "))
			System.out.println("Launch Goutam");
	
		// Substring
		System.out.println(str.substring(20));
		System.out.println(str.substring(20,30));
		
		String msg = "Your transaction id is 12345";
		// Objective is to get only 12345 from this string
		
		
	}
	
}