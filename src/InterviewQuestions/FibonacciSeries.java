package InterviewQuestions;

public class FibonacciSeries {

	public static void main(String[] args) {
		UsingIteration(15);

	}
	
	public static void UsingIteration(int n) {
		int first = 0, second = 1, next;
		for(int i=2; i<n;i++) {
			System.out.print(" "+ first);
			next = first+second;
			first = second;
			second = next;		
			
		}
	}

}
