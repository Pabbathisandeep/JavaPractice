package InterviewQuestions;

public class CountNoOfVowels {

	public static void main(String[] args) {
		String str = "Sandeep Reddya";
		int count = 0;
		char[] cArray = str.toCharArray();
		for(char c: cArray) {
			if(Character.toLowerCase(c)=='a'||Character.toLowerCase(c)=='e'||Character.toLowerCase(c)=='i'||Character.toLowerCase(c)=='o'||Character.toLowerCase(c)=='u') {
				count++;
			}
		}
		System.out.println(count);

	}

}
