package basic;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesInArrayList {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,10,30,20));
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("JAVA", "J2EE", "JSP", "JAVA"));
		ArrayList<String> newlist = new ArrayList<String>();
		for(String element: list) {
			if(!newlist.contains(element)) {
				newlist.add(element);
			}
		}
		System.out.print(newlist);
	}

}
