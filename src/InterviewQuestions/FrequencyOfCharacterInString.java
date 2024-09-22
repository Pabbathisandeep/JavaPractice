package InterviewQuestions;

import java.util.HashMap;
import java.util.Set;

public class FrequencyOfCharacterInString {

	public static void main(String[] args) {
		String s = "sandeep";
		
		HashMap<Character, Integer> cmap = new HashMap<Character, Integer>();
		for(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			if(Character.isAlphabetic(c)) {
				if(cmap.containsKey(c)) {
					cmap.put(c, cmap.get(c)+1);
				}else {
					cmap.put(c, 1);
				}
			}
		}
		System.out.println(cmap);
		
		Set<Character> charInString = cmap.keySet();
		for(char ch: charInString) {
			if(cmap.get(ch)>1) {
				System.out.println(ch+" "+cmap.get(ch));
			}
		}
		

	}

}
