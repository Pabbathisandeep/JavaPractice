package InterviewQuestions;

public class SumOfNNaturalNumbers {

	public static void main(String[] args) {
		UsingLoop(10);
		UsingFormula(10);
		UsingRecursion(10);
		

	}
	
	public static void UsingLoop(int n) {
		int sum =0;
		for(int i=1; i<=n;i++) {
			sum+= i;
		}
		System.out.println(sum);
	}
	
	public static void UsingFormula(int n) {
		System.out.println(n*(n+1)/2);
	}
	
	
	public static void UsingRecursion(int n) {
		int sum = getSum(n);
		System.out.println(sum);
	}
		static int getSum(int n) {
		if(n==0) 
			return n;
		
		return n + getSum(n-1);
	}


}
