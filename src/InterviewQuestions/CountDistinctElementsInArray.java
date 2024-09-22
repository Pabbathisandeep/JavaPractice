package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class CountDistinctElementsInArray {

	public static void main(String[] args) {
		int arr[] = {10,20,50,30,90,40,10,20};
		 Map<Integer, Integer> mp = new HashMap<>();
		 int count_dist = 0;
		 
		 for(int i=0;i<arr.length;i++) {
			 if(mp.containsKey(i)) {
				 mp.put(arr[i], mp.get(arr[i])+1);
			 }
			 else {
				 mp.put(arr[i],1);
			 }
		 }
		 System.out.println(mp.size());
	}
}
