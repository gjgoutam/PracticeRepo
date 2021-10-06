package PracticePackage3;

import java.util.Scanner;

public class fibonacciNumber {

	// Program to generate fibonacci numbers

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of fibonacci series needed - ");
		try {
			count = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Invalid input, please run the program again");
			System.exit(0);
		}
		sc.close();
		System.out.println("Entered number is " + count);
		fibonacci(count);
	}

	public static void fibonacci(int count) {
		int fib0 = 0;
		int fib1 = 1;
		int temp = 0;
		System.out.print(fib0 + " " + fib1 + " ");
		for (int i = 0; i < count; i++) {
			temp = fib1;
			fib1 = fib0 + fib1;
			fib0 = temp;
			System.out.print(fib1 + " ");
		}
	}
}
