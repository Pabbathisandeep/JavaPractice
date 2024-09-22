package InterviewQuestions;

public class FactorsOfNumber {

	public static void main(String[] args) {
		UsingForLoop(20);

	}
	
	public static void UsingForLoop(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}

}
