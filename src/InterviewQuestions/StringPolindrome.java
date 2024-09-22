package InterviewQuestions;

public class StringPolindrome {

	public static void main(String[] args) {
		String str = "sanas";
		String temp="";
//		char[] cArray = str.toCharArray();
//		for(int i=cArray.length-1;i>=0;i--) {
//			temp = temp+cArray[i];
//		}
//		System.out.println(temp);
//		if(str.equals(temp)) {
//			System.out.println("String is Polindrome");
//		}else {
//			System.out.println("String is not Polindrome");
//		}

		for(int i=str.length()-1;i>=0;i--) {
			temp = temp+str.charAt(i);
		}
		System.out.println(temp);
	}

}
