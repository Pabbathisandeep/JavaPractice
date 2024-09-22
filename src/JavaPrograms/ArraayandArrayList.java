package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraayandArrayList {

	public static void main(String[] args) {
//		initialize an array
//		first way
		int[] arr = new int[5];
		arr[0] = 2;
		arr[1]= 3;
		arr[2] = 6;
		arr[3] = 5;
		arr[4] = 6;
		System.out.println(Arrays.toString(arr));
// second way
		int[] arr2 = {2,3,4,5,6};
		System.out.println(Arrays.toString(arr2));
	
// Retrieving elements from array
	for(int i=0;i<arr2.length;i++) {
		System.out.println(arr2[i]);
	}
	
	System.out.println("***********");
	List<Integer> arrayList = new ArrayList<Integer>();
	arrayList.add(2);
	arrayList.add(3);
	arrayList.add(4);
	arrayList.add(9);
	arrayList.add(5);
	arrayList.remove(0);
	for(int i=0;i<arrayList.size();i++) {
		System.out.println(arrayList.get(i));
	}
	}

/* Difference between Array and array list
 * size can be fixed in array, length of array can be determined at the time of initialization.
 * array.lenght()
 * array can store any data type
 * Arraylist dynamic in size
 * arraylist.size();
 * Arraylist, you should specify type of elements to store
 */
}
