package InterviewQuestions;

public class RemoveSpacesFromString {

	public static void main(String[] args) {
		String str = "sandeep reddy";
//	Method 1
		System.out.println(str.replaceAll(" ", ""));

//		Method 2
		StringBuffer sb = new StringBuffer();
		String[] s1 = str.split(" ");
		for(String word:s1) {
			sb.append(word);
		}
		System.out.println(sb);
	}

}
