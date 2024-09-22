package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicateElementsInArray {

//	public static void main(String[] args) {
//		int arr[] = {10,20,50,30,90,40,50,20};
////		Set<Integer> hash_set = new HashSet<Integer>();
////		for(int i=0; i<arr.length;i++) {
////			hash_set.add(arr[i]);
////		}
////		System.out.println(hash_set);
//		
//		int n = removeDuplicates(arr);
//		for (int i=0; i<n; i++) {
//			System.out.print(arr[i]+" ");
//			}
//		
//	}
//	
//	public static int removeDuplicates(int arr[]) {
//		int j=0;
//		for(int i=0;i<arr.length-1;i++) {
//			if(arr[i]!=arr[i+1]) {
//				arr[j++] = arr[i];
//				arr[j++] = arr[arr.length-1];
//			}
//		}
//		return j;
//	}

	   static int removeDuplicates(int arr[], int n)
	   {
	      if (n==0 || n==1)
	         return n;
	int j = 0;
	for (int i=0; i<n-1; i++)
	if (arr[i] != arr[i+1])
	arr[j++] = arr[i];
	arr[j++] = arr[n-1];
	System.out.println(j);
	return j;
	}

	public static void main (String[] args)
	{
	int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};
	int n = arr.length;

	n = removeDuplicates(arr, n);

	for (int i=0; i<n; i++)
	System.out.print(arr[i]+" ");
	}
	}

