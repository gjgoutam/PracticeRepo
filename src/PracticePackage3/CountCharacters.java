package PracticePackage3;

import java.util.HashMap;

public class CountCharacters {

	public static void main(String[] args) {
		String Sentence = "aaaaaaaaaaaaAAAAAAAAAA0";
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		for(int i=0;i<Sentence.length();i++){ 
			if(hmap.containsKey(Sentence.charAt(i)))
			{
			  int value = hmap.get(Sentence.charAt(i))+1; // Hashmap always replaces values, cannot add values. hence this. 
			  hmap.put(Sentence.charAt(i),value);
			}
			else {
				hmap.put(Sentence.charAt(i), 1);
			}
		}
	
		hmap.forEach((k,v)->System.out.println(k+"  "+v));
		
	}
	
}
