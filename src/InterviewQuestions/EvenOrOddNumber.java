package InterviewQuestions;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		EvenOrOdd(4);
		UsingTernaryOperator(20);

	}
	public static void EvenOrOdd(int n) {
		if(n%2 == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
	
	public static void UsingTernaryOperator(int n) {
		String result = n%2==0?"Even":"Odd";
		System.out.println(result);
	}	

}
