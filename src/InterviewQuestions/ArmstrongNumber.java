package InterviewQuestions;

public class ArmstrongNumber {

	public static void main(String[] args) {
		UsingWhileLoop(9);

	}
	
	public static void UsingWhileLoop(int n) {
		int arm =0,r, temp;
		temp = n;
		while(n>0) {
			r= n%10;
			arm = arm+(r*r*r);
			n=n/10;
		}
		if(arm == temp) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
	}

}
