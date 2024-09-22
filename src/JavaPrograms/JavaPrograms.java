package JavaPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class JavaPrograms {

	public static void main(String[] args) throws IOException {
		reverseNumber(123654);
		reverseString("sandeep");
		countNumberOfDigitsInNumber(1236654);
		countOddEvenDigitsInNumber(1234567);
		fibonacci(5);
		factorial(5);
		int[] arr = {1,2,4,5,4,1};
		int[] arr2 = {3,4,7,8,5,2};
		sumOfElementsInArray(arr);
		CheckEqualityOfTwoArrays(arr,arr2);
		FIndMissingNumberInArray(arr);
		MinMaxNumberInArray(arr2);
		String[] str = {"sandeep", "reddy", "sandeep", "pabbathi"};
		DuplicateElementsInArray(str);
		SearchElementInArray(arr);
		sortElementsinArray(arr2);
		String str1 = "sandeep#$7984 84/*-";
		removeSpecialCharactersFromString(str1);
		OccuranceOfCharactersInString("sandeep reddy");
		wordsInString("sandeep reddy pabbathi");
		reverseEachWordInString("qa automation engineer");
		ReadDataFromtextFile("C:\\Users\\FL_LPT-476\\Desktop\\New Text Document.txt");
		WriteDataIntoTextFile("C:\\Users\\FL_LPT-476\\Desktop\\New Text Document.txt");
		

	}
	
	public static void reverseNumber(int n) {
		int rev=0;
		while(n>0) {
			rev = rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);
	}
	
	public static void reverseString(String str) {
		String str2 = "";
		for(int i=str.length()-1;i>=0;i--) {
			str2 = str2+str.charAt(i);
		}
		System.out.println(str2);
	}
	
	public static void countNumberOfDigitsInNumber(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
	
	public static void countOddEvenDigitsInNumber(int n) {
		int evenCount=0,oddCount=0,rem;
	
		while(n>0) {
			rem=n%10;
		if(rem%2==0) {
			evenCount++;
		}else {
			oddCount++;
		}
		n=n/10;
		}
		System.out.println(evenCount+" "+oddCount);
	}
	
	public static void fibonacci(int n) {
		int first=1, second=2, next;
		for(int i=0;i<n;i++) {
			System.out.print(first+" ");
			next= first+second;
			first = second;
			second = next;
		}
	}
	
	public static void factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact *= i;
		}
		System.out.println(fact);
	}
	
	public static void sumOfElementsInArray(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		System.out.println(sum);
	}
	
	public static void CheckEqualityOfTwoArrays(int[] arr1, int[] arr2) {
		boolean status=true;
		if(arr1.length == arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]!=arr2[i]) {
					status = false;
				}
			}
		}else {
			status = false;
		}
		if(status==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}
	
	public static void FIndMissingNumberInArray(int[] arr) {
		int sum1=0,sum2=0;
		for(int i=0;i<arr.length;i++) {
			sum1 = sum1+arr[i];
		}
		for(int i=0;i<=5;i++) {
			sum2 = sum2+i;
		}
		
		System.out.println(sum2-sum1);
	}
	
	public static void MinMaxNumberInArray(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			if(arr[i]>max) {
				max= arr[i];
			}
		}
		System.out.println(min+" "+max);
		
	}
	
	public static void DuplicateElementsInArray(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
	
	public static void SearchElementInArray(int[] arr) {
		int search_ele = 3;
		boolean flag = false;
		for(int i=0;i<arr.length;i++) {
			if(search_ele == arr[i]) {
				System.out.println("search element found at: "+i);
				flag = true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("search element not found");
		}
	}
	
	public static void sortElementsinArray(int[] arr) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	}
	
	public static void removeSpecialCharactersFromString(String str) {
		System.out.println(str.replaceAll("\\d", "")); //to remove numbers
		System.out.println(str.replaceAll("[^A-Za-z]",""));//to print only characters
		System.out.println(str.replaceAll("[^0-9]", ""));//to print only numbers
		System.out.println(str.replaceAll("[^\\w\\s]", ""));//replace everything that not character/number/whitespace
		System.out.println(str.replaceAll("\\s", ""));//to remove white space
	}
	
	public static void OccuranceOfCharactersInString(String str) {
		char[] charArr = str.toCharArray();
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for(int i=0;i<charArr.length;i++) {
			if(charCount.containsKey(charArr[i])) {
				charCount.put(charArr[i], charCount.get(charArr[i])+1);
			}else {
				charCount.put(charArr[i], 1);
			}
		}
		System.out.println(charCount);
//		Duplicate characters and their occurrance
		System.out.println(charCount.size());
		Set<Character> charInString = charCount.keySet();
		for(Character c:charInString) {
			if(charCount.get(c)>1) {
				System.out.println(c+" "+charCount.get(c));
			}
		}
	}
	
	public static void wordsInString(String str) {
		String[] words = str.split(" ");
		System.out.println(words.length);
	}
	
	public static void reverseEachWordInString(String str) {
		String revStr = "";
		String[] words = str.split(" ");
		for(String word:words) {
			String revWord = "";
			for(int i=word.length()-1;i>=0;i--) {
				revWord = revWord+word.charAt(i);
			}
			revStr = revStr+revWord+" ";
		}
		System.out.println(revStr);
	}
	
	public static void ReadDataFromtextFile(String fileLocation) throws IOException {
		File f = new File(fileLocation);
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		FileReader fr = new FileReader(fileLocation);
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str = br.readLine())!=null) {
			System.out.println(str);
		}
		br.close();
	}
	
	public static void WriteDataIntoTextFile(String Filelocation) throws IOException {
		FileWriter fw = new FileWriter(Filelocation);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("QA automation Engineer");
		bw.write("Hyderbad");
		bw.write("Fission Labs");
		
		bw.close();
	}


}
