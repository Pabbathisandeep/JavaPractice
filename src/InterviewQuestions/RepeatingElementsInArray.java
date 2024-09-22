package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class RepeatingElementsInArray {

	public static void main(String[] args) {
		int arr[] = {10,20,50,30,90,40,50,20,1};
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i])+1);
			}
			else {
				mp.put(arr[i], 1);
			}
		}
		
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
