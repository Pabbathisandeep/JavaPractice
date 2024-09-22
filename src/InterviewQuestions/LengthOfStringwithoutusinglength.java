package InterviewQuestions;

public class LengthOfStringwithoutusinglength {

	public static void main(String[] args) {
		String str = "Sandeep";
		int length=0;
		char[] cArray = str.toCharArray();
		for(char c:cArray) {
			length++;
		}
		System.out.println(length);

	}

}
