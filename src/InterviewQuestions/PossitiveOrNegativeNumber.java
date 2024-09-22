package InterviewQuestions;

public class PossitiveOrNegativeNumber {

	public static void main(String[] args) {
		UsingBruteForce(0);
//		UsingNestedIf(0);
//		UsingTernaryOperator(-20);
		
	}
		
		
	public static void UsingBruteForce(int n) {	
		if(n>0) {
			System.out.println("Positive Number");
		}
		else if(n<0) {
			System.out.println("Negative Number");
		}
		else {
			System.out.println("Zero");
		}
	}
	
	public static void UsingNestedIf(int n) {
		if(n>=0) {
			if(n==0) {
				System.out.println("Zero");
			}
			else {
				System.out.println("Positive Number");
			}
		}
		else {
			System.out.println("Negative Number");
		}
	}
	
	public static void UsingTernaryOperator(int n) {
		if(n == 0) {
			System.out.println("Zero");
		}
		else {
			String result = n>0? "Positive Number":"Negative Number";
			System.out.println(result);
		}
	}
	

}
