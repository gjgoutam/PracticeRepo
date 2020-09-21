package practicePackage;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// integer array
		int arr[] = new int[20];

		for (int i = 0; i < 20; i++) {
			if (i == 0)
				arr[i] = i;
			else
				arr[i] = i + arr[i - 1];
		}

		for (int j = 0; j < arr.length; j++)
			System.out.println(arr[j]);

		System.out.println("The length of the array is " + arr.length);
		// String Array
		String strArr[] = new String[3];
		strArr[0] = "ITC";
		strArr[2] = "Value";
		strArr[1] = "Enduring";

		for (int i = 0; i < strArr.length; i++)
			System.out.println("The value in position " + i + " is " + strArr[i]);

		System.out.println("Sum of 10th and last values of integer array is " + (arr[10] + arr[19]));
		System.out.println("Sum of 2nd and last values of string array is " + (strArr[1] + strArr[2]));

		// Object array
//		
//		Object obArr = new Object[2];
//		obArr[0]="Goutam";
//		obArr[1]=31;
//		System.out.println(obArr[1]);

			

		System.out.println("-----------------------------------------------------------");
		// Loops practice
		int num = 4;
		LoopsPractice1 loops = new LoopsPractice1();
		String result = loops.oddEven(num);
		System.out.println(result);

	}
}