package PracticePackage3;

import java.util.Arrays;

public class SortStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] text = {"zzz","ttt","llll","123","zzzz", "aaaa","xxxxx"};
		// Sorting array in alphabetical order 
		Arrays.sort(text);
		
		for(int i=0;i<text.length;i++) {
			System.out.println(text[i]);
		}
		
	}
}
