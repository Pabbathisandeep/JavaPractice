package JavaPrograms.NaveenAutomationLabs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class ArrayPrograms {

	public static void main(String[] args) {
		int[] arr = {1,2,4,5};
		missingNumberInArray(arr);
		String[] strArr = {"sandeep", "reddy", "sandeep", "pabbathi", "reddy"};
		duplicateElements(strArr);
		int[] arr1 = {5,6,84,1,6,3,2,1};
		LargestSmallestNumber(arr1);
		String str = "sandeep reddy pabbathi sandeep reddy";
		CountNumberOfDuplicateWords(str);
		String str2 = "948468484";
		System.out.println(verifystringcontaindigits(str2));
		String[] str3 = {"sandeep", "reddy", "pabbathi"};
		String[] str4 = {"Hyderabad", "Madhapur", "Hiteccity"};
		JoinTwoArrays(str3, str4);
		RemoveDuplicateElementsInArray(arr1);
		}
	
	public static void missingNumberInArray(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		int sum1=0;
		for(int i=1;i<=5;i++) {
			sum1 = sum1+i;
		}
		System.out.println(sum1-sum);
	}
	
	public static void duplicateElements(String[] str) {
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i]==str[j]) {
					System.out.println(str[i]);
				}
			}
		}
	}
	
	public static void LargestSmallestNumber(int[] arr) {
		int max = arr[0], min= arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			else if(arr[i]<min) {
			min = arr[i];
			}
		}
		System.out.println(max+" "+min);
	}
	
	public static void CountNumberOfDuplicateWords(String str) {
		String[] words = str.split(" ");
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		for(String word:words) {
			if(wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word)+1);
			}else {
				wordCount.put(word, 1);
			}
		}
		System.out.println(wordCount.size());
		System.out.println(wordCount);
		Set<String> wordsInString = wordCount.keySet();
		for(String word:wordsInString) {
			if(wordCount.get(word)>1) {
				System.out.println(word+" "+wordCount.get(word));
			}
		}
	}
	
	public static boolean verifystringcontaindigits(String str) {
		char[] cArray = str.toCharArray();
		for(int i=0;i<cArray.length;i++) {
			if(!Character.isDigit(cArray[i])) {
				return false;
			}
		}
		return true;
	}
	
	public static void JoinTwoArrays(String[] str1, String[] str2) {
		Stream<String> stream1 = Arrays.stream(str1);
		Stream<String> stream2 = Arrays.stream(str2);
		String fullStream[] = Stream.concat(stream1, stream2).toArray((size->new String[size]));
		for(String s: fullStream) {
			System.out.println(s);
		}
	}
	
	public static void RemoveDuplicateElementsInArray(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i:arr) {
			set.add(i);
		}
		int[] uniqueArray = new int[set.size()];
		int index=0;
		for(int value:set) {
			uniqueArray[index++] = value;
		}
		System.out.println(Arrays.toString(uniqueArray));
	}
	
	
}
