package practicePackage;

public class LoopsPractice1 {

	public String oddEven(int num) {
		String numType = null;

		if (num % 2 == 1)
			numType = "Wierd";
		else if (num % 2 == 0
				) {
			if (num >= 2 && num <= 5)
				numType = "Not Wierd";
			else if (num >= 6 && num <= 20)
				numType = "Wierd";
			else
				numType = "Not Wierd";
		}
		return (numType);
	}
}
