package InterviewQuestions;

public class GreatestofTwoNumbers {

	public static void main(String[] args) {
		UsingIfElse(30, 20);
		UsingTernaryOperator(30,40);
		UsingInbuiltMethod(10,60);

	}
	
	public static void UsingIfElse(int a, int b) {
		if(a == b) {
			System.out.println("Both numbers are equal");
		}
		else if(a>b) {
			System.out.println(a +" Greatest");
		}
		else {
			System.out.println(b +" Greatest");
		}
	}
	
	public static void UsingTernaryOperator(int a, int b) {
		if(a==b) {
			System.out.println("Both numbers are equal");
		}
		else {
			int temp = a>b? a:b;
			System.out.println(temp+" Greatest");
		}
	}
	
	public static void UsingInbuiltMethod(int a, int b) {
		if(a==b) {
			System.out.println("Both numbers are equal");
		}
		else {
			
			System.out.println(Math.max(a, b)+ " Greatest");
		}
	}
	

}
