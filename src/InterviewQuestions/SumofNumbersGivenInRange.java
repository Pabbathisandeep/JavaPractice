package InterviewQuestions;

public class SumofNumbersGivenInRange {

	public static void main(String[] args) {
		UsingBruteForce(10,15);
		UsingBruteForce(10,15);
	}
	
	public static void UsingBruteForce(int a, int b) {
		int sum = 0;
		for(int i=a; i<=b;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	public static void UsingFormula(int a, int b) {
		int sum = b*(b+1)/2 - a*(a+1)/2;
		System.out.println(sum);
	}

}
