package PracticePackage3;

import java.util.Scanner;

public class StrReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello world");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text -");
		String Normal = sc.nextLine();
		sc.close();
		
		//String Normal = "QA Engineer";
		String Rev = "";
		Rev = StrRevStringBuffer(Normal);
		System.out.println(Normal + " is a Palindrome = " + chkPalindrome(Normal, Rev));
		Normal = "KayaK";
		Rev = StrRevStringBuffer(Normal);
		System.out.println(Normal + " is a Palindrome = " + chkPalindrome(Normal, Rev));
		Normal = "CBC Toronto News";
		Rev = StrRevStringBuilder(Normal);
		System.out.println(Normal + " is a Palindrome = " + chkPalindrome(Normal,Rev));
	}

	static boolean chkPalindrome(String Normal, String Rev) {
		if (Normal.equals(Rev))
			return true;
		else
			return false;
	}

	static String StrRevStringBuffer(String str) {
		StringBuffer strBuff = new StringBuffer(str);
		strBuff.reverse();
		return strBuff.toString();
	}

	static String StrRevStringBuilder(String str) {
		StringBuilder strBuild = new StringBuilder(str);
		strBuild.reverse();
		return strBuild.toString();
	}

}
