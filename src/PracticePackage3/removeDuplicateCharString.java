package PracticePackage3;

import java.util.Scanner;

public class removeDuplicateCharString {

	public static void main(String[] args) {

		String text;
		Scanner sc = new Scanner(System.in);
		text = sc.nextLine();
		sc.close();
		PrintUniqueChars(text);	

	}

	public static void PrintUniqueChars(String text) {

		String uniq = " ";

		for (int i = 0; i < text.length(); i++) {
			if (!uniq.contains(String.valueOf(text.charAt(i)))) {
				uniq = uniq + text.charAt(i);
			}
		}
		System.out.println(uniq);
	}
	
	public static void UniqueChars(String text) {
		
	}
}