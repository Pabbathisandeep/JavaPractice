package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FizzBuzzNumbers1to100 {

	public static void main(String[] args) {
		FizzBuzz(10);
//		Polindrome(12321);
//		Fibonacci(5);
//		Factorial(5);
		int[] arr = {5,4,8,6,5,6,8};
		FindMinMaxValue(arr);
		SecondLargestSmallestValue(arr);
//		ReverseString("sandeep");
//		PrimeNumber(67);
//		ArmStrongNumber(1634);
//		DuplicateWords("sandeep reddy sandeep");
//		OccurrenceOfEachCharacterInString("sandeep");
//		ReverseEachWordInString("sandeep reddy");
//		Anagram("anagram","nagaram");
//		ReverseArrayWithoutTemp(arr);
		ReverseStringPreservingPositionSpaces("sandeep reddy pabbathi");
//		findDuplicates(arr);
//		LeapYear(1900);
//		GeneratePrimeNumbers(50);
//		CountWordsInString("sandeep reddy");
//		CountWordsInStringUsingHashMap("sandeep reddy pabbathi");
//		SwapTwoNumbers(20,10);
//		RemoveWhiteSpacesWithoutUsingReplace("sandeep reddy 123");
//		RightHalfPyramidPattern(5);
		ReverseRightHalfPyramidPattern(5);		
		leftHalfPyramidPattern(5);
		ReverseLeftHalfPyramidPattern(5);
}
		public static void FizzBuzz(int n) {
		for(int i=1;i<n;i++) {
			if((i%3==0) && (i%5==0)) {
				System.out.println("FizzBuzz");
			} 
			else if (i%3==0) {
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
		}
		
		public static void Polindrome(int n) {
			int rev=0;
			while(n>0) {
				rev= rev*10+n/10;
				n=n/10;
			}
			if(n==rev) {
				System.out.println("polindrome");
			}else
				System.out.println("not polindrome");
		}
		
		public static void Fibonacci(int n) {
			int first=0, second=1, next;
			while(n>0) {
				System.out.print(first+" ");
				next = first+second;
				first = second;
				second = next;
				n--;
			}
		}
		
		public static void Factorial(int n) {
			int fact=1;
			for(int i=1;i<=n;i++) {
				fact = fact*i;
			}
			System.out.println(fact);
		}
		

		public static void FindMinMaxValue(int arr[]) {
			int max = arr[0];
			int min = arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>max) {
					max = arr[i];
				}
				else if(arr[i]<min) {
					min = arr[i];
				}
			}
			System.out.println(max);
			System.out.println(min);
		}
		
		public static void SecondLargestSmallestValue(int arr[]) {
			int temp;
			for(int i=0; i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);   // sorted array
			}
				System.out.println("Second Smallest Number "+ arr[1]);
				System.out.println("Second Largest Number "+ arr[arr.length-2]);
			}
		
		public static void ReverseString(String str) {
			String revStr="";
			for(int i=str.length()-1;i>=0;i--) {
				revStr = revStr+str.charAt(i);
			}
			System.out.println(revStr);
		}
		
		public static void PrimeNumber(int n) {
			int flag=0;
			if(n==0||n==1) {
				System.out.println("Smallest Prime Number is 2");
			}else {
				for(int i=2;i<=n/2;i++) {
					if(n%i==0) {
						flag=1;
						break;
					}
				}
			}
			if(flag==1) {
				System.out.println("Not Prime Number");
			}else {
				System.out.println("Prime Number");
			}
		}
		
		public static void ArmStrongNumber(int n) {
			int arm=0;
			int temp=n;
			while(n>0) {
				int r = n%10;
				arm = arm+r*r*r;
				n=n/10;
			}
			if(arm==temp) {
				System.out.println("Armstrong Number");
			}else {
				System.out.println("not armstrong number");
			}
		}
		
		public static void DuplicateWords(String str) {
			String[] words = str.split(" ");
			Map<String, Integer> wordCount = new HashMap<String, Integer>();
			for(String word: words) {
				if(wordCount.containsKey(word)) {
					wordCount.put(word, wordCount.get(word)+1);	
				}else {
					wordCount.put(word, 1);
				}
			}
			System.out.println(wordCount.size());  // Distinct words in string
			Set<String> wordsInString = wordCount.keySet();
			for(String word: wordsInString) {
				if(wordCount.get(word)>1) {
					System.out.println(word+" "+wordCount.get(word));
				}
			}
		}
		
		public static void OccurrenceOfEachCharacterInString(String str) {
			char[] charArray = str.toCharArray();
			Map<Character, Integer> charCount = new HashMap<Character, Integer>();
			for(char c: charArray) {
				if(charCount.containsKey(c)) {
					charCount.put(c, charCount.get(c)+1);
				}else {
					charCount.put(c, 1);
				}
			}
			System.out.println(charCount); //occurrence of each character in string
			
			Set<Character> charInString = charCount.keySet();
			for(char c: charInString) {
				if(charCount.get(c)>1) {
					System.out.println(c+" "+ charCount.get(c)); // duplicate characters and their occurrences
				}
			}
		}
		
		public static void ReverseEachWordInString(String str) {
			String[] words = str.split(" ");
			String revString ="";
			for(String word:words) {
				String revWord = "";
				for(int i=word.length()-1; i>=0;i--) {
					revWord = revWord+word.charAt(i);
				}
				revString = revString+ revWord+" ";
			}
			System.out.println(revString);
		}
		
		public static void Anagram(String str1, String str2) {
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			if(charArray1.length!=charArray2.length) {
				System.out.println("Not Anagram");
			}else {
				Arrays.sort(charArray1);
				Arrays.sort(charArray2);	
				}
			System.out.println(Arrays.equals(charArray1, charArray2));
			}
	

		public static void ReverseArrayWithoutTemp(int[] arr) {
			int initial = 0, last = arr.length-1;
			while(initial < last) {
				arr[initial] ^= arr[last];
				arr[last] ^= arr[initial];
				arr[initial] ^= arr[last];	
				initial++;
				last--;
				
			}
			for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		}
		
		public static void ReverseStringPreservingPositionSpaces(String str) {
			char[] charArray = str.toCharArray();
			char[] resultArray = new char[charArray.length];
			for(int i=0;i<charArray.length;i++) {
				if(charArray[i]==' ') {
					resultArray[i]=' ';
				}
			}
			int j= charArray.length-1;
			for(int i=0;i<charArray.length;i++) {
				if(charArray[i] != ' ') {
					if(resultArray[j] == ' ') {
						j--;
					}
					resultArray[j] = charArray[i];
					j--;
				}
			}
			System.out.println(str+" => "+String.valueOf(resultArray));			
		}
		
		public static void findDuplicates(int[] arr) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						System.out.println(arr[j]);
						list.add(arr[i]);
					}
				}
			}
			System.out.println(list);
		}
		
		public static void LeapYear(int n) {
			if((n%400==0)||(n%4==0)&&(n%100==0)) {
				System.out.println("leap year");
			}else {
				System.out.println("not leap year");
			}
		}
		
		public static void GeneratePrimeNumbers(int n) {
			for(int i=1;i<n;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
			}	
			}
		
		public static void CountWordsInString(String str) {
			String[] wordsArray = str.split(" ");
			System.out.println(wordsArray.length);
		}
		
		public static void CountWordsInStringUsingHashMap(String str) {
			String[] wordsArray = str.split(" ");
			Map<String, Integer> map = new HashMap<String, Integer>();
			for(int i=0;i<wordsArray.length;i++) {
				if(map.containsKey(wordsArray[i])){
					map.put(wordsArray[i], map.get(wordsArray[i])+1);
				}else {
					map.put(wordsArray[i], 1);
				}
			}
			System.out.println(map);
		}
		
		public static void SwapTwoNumbers(int a, int b) {
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println(a+" "+b);
		}
		
		public static void RemoveWhiteSpacesWithoutUsingReplace(String str) {
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<str.length();i++) {
				if((str.charAt(i)!=' ')&&(str.charAt(i) != '\t')) {
					sb.append(str.charAt(i));
				}
			}
			System.out.println(sb);
		}
		
		public static void RightHalfPyramidPattern(int n) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public static void ReverseRightHalfPyramidPattern(int n) {
			for(int i=n;i>=1;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public static void leftHalfPyramidPattern(int n) {
			for(int i=n;i>=1;i--) {
				for(int j=1;j<i;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<n-i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public static void ReverseLeftHalfPyramidPattern(int n) {
			int num = 2*n-2;
			for(int i=n;i>0;i--) {
				for(int j=0;j<=n-i;j++) {
					System.out.print(" ");
				}
					num= num-2;
					for(int j=0;j<i;j++) {
						System.out.print("*");
					}
					System.out.println();
					
				}
			}
		}
		
		
		


