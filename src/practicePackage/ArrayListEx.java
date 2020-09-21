package practicePackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Arraylist without data type, it will show warnings. This type of arraylist is
		// called raw type data arraylist.

		ArrayList ar = new ArrayList();
		ar.add(1);
		ar.add("Goutam");
		ar.add("Employee");
		ar.add(800000);
		ar.add(31.2);
		ar.add(1);

		System.out.println(ar.size());

		// Printing all the elements in the arraylist.

		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		// Removing an element from the arraylist

		ar.remove(5);
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		System.out.println("___________________________________________________");
		// arraylist with data types, also called as generics(data types are called
		// generics in this case only)

		// Arraylist with string as the generic
		ArrayList<String> arrGenerics = new ArrayList<String>();
		arrGenerics.add("Hi");
		arrGenerics.add("Hello");

		for (int i = 0; i < arrGenerics.size(); i++)
			System.out.println(arrGenerics.get(i));

		// ArrayList as integer as generics

		ArrayList<Integer> arrGenInt = new ArrayList<Integer>(); // Integer is a wrapper class for int, here only
																	// classes can be used for arraylist, hence this is
																	// used instead of int.
		arrGenInt.add(99);
		arrGenInt.add(100);
		arrGenInt.add(101);

		// ArrayList with double is same and use Double in <>.

//_____________________________________________________________________________________

		System.out.println("___________________________________________________");

		// Oject arraylist, can store any type of data. the generic here is an object.
		ArrayList<Object> arrObj = new ArrayList<Object>();
		arrObj.add(01);
		arrObj.add("Student_Name");
		arrObj.add(true);
		arrObj.add(81.112);

		for (int i = 0; i < arrObj.size(); i++)
			System.out.println(arrObj.get(i));

		System.out.println("After replacement");

		arrObj.set(2, false); // This is replace values in existing arraylist
		for (int i = 0; i < arrObj.size(); i++)
			System.out.println(arrObj.get(i));

		System.out.println("___________________________________________________");
		System.out.println("Hash Map example");

		HashMap hMap = new HashMap();
		hMap.put(1, "Abcd");
		System.out.println(hMap.get(1));

		System.out.println("Hash Map with Generics");
		HashMap<String, String> hmap1 = new HashMap<String, String>();
		hmap1.put("a", "Java");
		hmap1.put("b", "Python");
		hmap1.put("c", "C#");
		hmap1.put("d", "Rubo");

		for (Map.Entry<String, String> ent : hmap1.entrySet()) {
			System.out.println(ent.getKey() + "  " + ent.getValue());
		}
	}
}
