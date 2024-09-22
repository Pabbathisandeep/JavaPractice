package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class DistinctElementsInArray {

	public static void main(String[] args) {
		int[] arr = {2,5,8,9,6,2,5};
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		int count_dist=0;
		for(int i=0;i<arr.length;i++) {
			if(mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i])+1);
			} else {
				mp.put(arr[i], 1);
			}
		}
//		System.out.println(mp.size());
		for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
//			To find repeating elements
			if(entry.getValue()>1)
				System.out.println(entry.getKey());
//			To find non repeating elements
			if(entry.getValue() == 1)
				System.out.println(entry.getKey());
		}		

	}

}
