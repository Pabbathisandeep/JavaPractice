package basic;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersWithCount {

	public static void main(String[] args) {
		String str = "Sandeep Reddy";
		char[] strArray = str.toCharArray();
		HashMap<Character, Integer> charcount = new HashMap<Character, Integer>();
		for(char c : strArray) {
			if(charcount.containsKey(c)) {
				charcount.put(c, charcount.get(c)+1);
			}
			else {
				charcount.put(c, 1);
			}
		}
//		System.out.print(charcount);
		
		Set<Character> charInString = charcount.keySet();
		for(Character ch: charInString) {
			if(charcount.get(ch)>1) {
				System.out.println(ch+ " "+ charcount.get(ch));
			}
		}
	
	
	}

}
