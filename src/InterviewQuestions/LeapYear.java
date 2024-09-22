package InterviewQuestions;

public class LeapYear {

	public static void main(String[] args) {
		UsingIfElse(2001);

	}
	public static void UsingIfElse(int n) {
		if(n%400 == 0) {
			System.out.println(n+" leap year");
		}
		else if((n%4 ==0) && (n%100 !=0)) {
			System.out.println(n+" leap year");
		}
		else {
			System.out.println(n+" not a leap year");
		}
	}

}
