package InterviewQuestions;

public class Factorial {

	public static void main(String[] args) {
		UsingIterativeApproach(5);
		System.out.println(factorial(5));

	}
	
	public static void UsingIterativeApproach(int n) {
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact *= i;
		}
		System.out.println(fact);
	}
	
	static int factorial(int n)
	{
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

}
