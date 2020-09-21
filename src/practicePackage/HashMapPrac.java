package practicePackage;

import java.util.HashMap;
import java.util.Map;

public class HashMapPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating hashmap with generics
		HashMap<String, String> hmap1 = new HashMap<String, String>();
		hmap1.put("Key a","Value for key a");
		hmap1.put("Key b","Value for key b");
		hmap1.put("Key c","Value for key c");
		
		
		// 1st method to print
		for(Map.Entry<String, String> entry : hmap1.entrySet()){
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
		
		// second method to print 
		
		hmap1.forEach((k,v) -> System.out.println(k+"    "+v));
			
	}

}
