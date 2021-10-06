package PracticePackage3;

import java.util.Scanner;

public class xPrac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// loops programs

		// if and if else greatest of 3 nos using function and input number from
		// keyboard

		// Input of numbers from keyboard using the functions.
		xPrac1 obj1 = new xPrac1();
		int x = obj1.getNumberInput();
		int y = obj1.getNumberInput();
		int z = obj1.getNumberInput();

		// calling function to calculate greatest of the 3 numbers
		System.out.println("The greatest number is " + obj1.greatestNum(x, y, z));
	}

	public int getNumberInput() {
		int a = 0;
		do {
			try {
				System.out.println("Enter a number = ");
				Scanner s = new Scanner(System.in);
				a = s.nextInt();
				s.close();
			} catch (Exception e) {
				System.out.println(e);
				a = 0;
			}

		} while (a <= 0);
		System.out.println("Entered number is = " + a);
		return a;
	}

	public int greatestNum(int x, int y, int z) {
		if (x > y && x > z)
			return x;
		else if (y > x && y > z)
			return y;
		else
			return z;
	}
}
