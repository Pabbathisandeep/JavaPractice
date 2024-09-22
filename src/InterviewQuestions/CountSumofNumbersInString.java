package InterviewQuestions;

public class CountSumofNumbersInString {

	public static void main(String[] args) {
		String str = "sandeep12435";
		int sum1 = 0;
		
//		Method 1
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				sum1 =sum1+(str.charAt(i)-'0');
			}
		}
		System.out.println(sum1);

//		Method 2 
		int sum2=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				sum2 = sum2+Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println(sum2);
	}

}
