package JavaPrograms.NaveenAutomationLabs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class stringPrograms{

	public static void main(String[] args) {
		ReverseString("hyderabad");
		RemoveJunkInString("asdwq3e!@#162");
		String a = "sandeep";
		String b = "reddy";
		swapTwoStrings(a,b);
		DuplicateCharactersInString("sandeep reddy pabbathi");
		PrintString();
		System.out.println(getCharCount("sandeep", 'e'));
		VowelCountInString("Sandeep");
		System.out.println(subStringPresentInString("sandeep", "deep"));

	}
	
	public static void ReverseString(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	public static void RemoveJunkInString(String str) {
		System.out.println(str.replaceAll("[^0-9A-Za-z]", ""));
		System.out.println(str.replaceAll("[^\\w\\s]", ""));
	}
	
	public static void swapTwoStrings(String a, String b) {
		a = a+b;
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		System.out.println(a+" "+b);
	}
	
	public static void DuplicateCharactersInString(String str) {
		char[] cArray = str.toCharArray();
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for(char c:cArray) {
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c)+1);
			}else {
				charCount.put(c, 1);
			}
		}
		System.out.println(charCount);
		Set<Character> charInString = charCount.keySet();
		for(char c: charInString) {
			if(charCount.get(c)>1) {
				System.out.println(c+" "+charCount.get(c));
			}
		}
	}
	
	public static void PrintString() {
		System.out.println("/'Hello'/"); // /"Hello"/
	}
	
	public static long getCharCount(String str, char c) {
		return str.chars().filter(e -> (char)e == c).count();
	}
	
	public static boolean isVowel(char c) {
		return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
	}
	public static void VowelCountInString(String str) {
		int vCount=0;
		for(int i=0;i<str.length();i++) {
			if(isVowel(str.charAt(i))) {
				vCount++;
			}
		}
		System.out.println(vCount);
	}
	
	public static boolean subStringPresentInString(String main, String sub) {
		return main.matches("(.*)"+sub+"(.*)");
	}

}
