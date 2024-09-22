package basic;

import java.util.HashMap;
import java.util.Set;

public class JavaPracticePrograms {

	public static void main(String[] args) {
		isPrime(5);
		DuplicateCharacters("FissionLabs");
		RemoveSpecialCharacters("+(979)-545464467");
		UserInputNumberOrNot("a");
		int[] a = {10,20,30,50,10};
		ReverseArray(a);
		CountWordsInString("Sandeep Reddy Pabbathi");
		DuplicateCharacterswithCount("FissionLabs");
		SwapTwoNumbers(10,20);
		NumberOfWordsInString("Sandeep Reddy Pabbathi Sandeep");
		Polindrome(140);
		Fibonacci(6);
		secondHighestNumberInArray(a);
		armstrongNumber(153);
		RemoveWhiteSpacesInString("s a n d e e p");
		RemoveWhiteSpacesWIthoutUsingReplace("edsed fsefesf fsfse");
		factorial(10);
		sumofElementsInArray(a);
		sortArray(a);
		ReverseEachWordInString("Sandeep Reddy");
		ReverseNumber(12365488);
		EvenOdd(57);
		SumeofDigitsINNumber(1252);
		
		
		
	}
	public static void SumeofDigitsINNumber(int n) {
		int sum=0;
		while(n>0) {
			sum = sum+n%10;
			System.out.println(sum);
			n= n/10;
		}
	}
		
	private static void isPrime(int n) {	
	int m,flag=0;
		m=n/2;
		if(n <= 1) {
			System.out.println("Smallest prime number is 2");
		}
		else {
			for(int i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println("not a prime");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("prime");
			}
		}

	}
	
	private static void DuplicateCharacters(String str) {
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			for(int j=i+1;j<charArray.length;j++) {
				if(charArray[i]==charArray[j]) {
					System.out.print(charArray[i]+" ");
				}
			}
		}
	}
	
	private static void RemoveSpecialCharacters(String str) {
		String str1 = str.replaceAll("\\D", "");
		System.out.println(str1);
	}
	
	
	private static void UserInputNumberOrNot(String input) {
		try {Double.parseDouble(input);
		System.out.print("Number");
	}catch(NumberFormatException e){
		System.out.print("Not Number");
	}
		System.out.println();
	}
	
	private static void ReverseArray(int array[]) {
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	private static void CountWordsInString(String str) {
		String [] words = str.split(" ");
		System.out.println(words.length);
	}
	
	private static void DuplicateCharacterswithCount(String str) {
		char [] cArray = str.toCharArray();
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		for(char c:cArray) {
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c)+1);
			}
			else {
				charCount.put(c, 1);
			}
		}
		Set<Character> charInString = charCount.keySet();
		for(Character ch: charInString) {
			if(charCount.get(ch)>1) {
				System.out.println(ch+" "+charCount.get(ch));
				
			}
		}
	}
	
	private static void SwapTwoNumbers(int a, int b) {
		a=a+b; //30
		b=a-b; //10
		a=a-b; //20
		System.out.print(a+" "+b);
	}
	
	private static void NumberOfWordsInString(String str) {
		String[] words = str.split(" ");
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		for(String word: words) {
			if(wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word)+1);
			}
			else {
				wordCount.put(word, 1);
			}
		}
		System.out.println(wordCount);
		
	}
	
	private static void Polindrome(int n) {
		int temp, r, rev=0;
		temp=n;
		while(n>0) {
			r = n%10;
			n=n/10;
			rev = rev*10+r;
		}
		if(rev==temp) {
			System.out.println("polindrome");
		}
		else {
			System.out.println("not polindrome");
		}
	}
	
	public static void Fibonacci(int n) {
		int first =0, second =1, next;
		for(int i=0;i<n;i++) {
			System.out.print(first+" ");
			next = first+second;
			first = second;
			second = next;
		}
	}
	
	public static void secondHighestNumberInArray(int[] array) {
		int largest=0, secondlargest=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]>largest) {
				secondlargest = largest;
				largest = array[i];
			}
			else if(array[i]> secondlargest) {
				secondlargest = array[i];
			}
		}
		System.out.println("largest value"+" "+ largest);
		System.out.println("second largest value"+" " +secondlargest);
	}
	
	public static void armstrongNumber(int n) {
		int temp,r, arm=0;
		temp=n;
		while(n>0) {
			r = n%10;
			n= n/10;
			arm = arm+(r*r*r);
		}
		if(arm == temp) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not armstrong number");
		}
	}
	
	public static void RemoveWhiteSpacesInString(String str) {
//		String str2 = str.replaceAll(" ", "");
		String str2 = str.replaceAll("\\s", "");
		System.out.println(str2);
	}
	
	public static void RemoveWhiteSpacesWIthoutUsingReplace(String str) {
		char[] charArray = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<charArray.length;i++) {
			if((charArray[i]!=' ') && (charArray[i] != '\t')) {
				sb.append(charArray[i]);
			}
		}
		System.out.println(sb);
	}
	
	public static void factorial(int n) {
		int fact=1;
		while(n>0) {
			fact = fact*n;
			n--;
		}
		System.out.println(fact);
	}
	
	public static void sumofElementsInArray(int[] arr) {
		int sum= 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		System.out.println(sum);
	}
	
	public static void sortArray(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void ReverseEachWordInString(String str) {
		String[] words = str.split(" ");
		String reverseString = "";
		for(String word: words) {
			String reverseWord = "";
			for(int i=word.length()-1;i>=0;i--) {
				reverseWord = reverseWord+word.charAt(i);
			}
			reverseString = reverseString+reverseWord+" ";
		}
		System.out.println(reverseString);
		
	}
	
	public static void ReverseNumber(int n) {
		int rev =0;
		while(n!=0) {
			rev = rev*10+n%10;
			n= n/10;
		}
		System.out.println(rev);
	}
	
	public static void EvenOdd(int n) {
		if(n%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd number");
		}
	}
	
	

}
