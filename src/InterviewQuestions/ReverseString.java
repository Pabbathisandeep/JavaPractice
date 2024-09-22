package InterviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Sandeep";
		String rev="";
		
//		Method 1
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		
//		Method 2
		for(int i=str.length()-1;i>=0;i--) {
			rev= rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}
