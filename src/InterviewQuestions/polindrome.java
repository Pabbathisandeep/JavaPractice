package InterviewQuestions;

public class polindrome {

	public static void main(String[] args) {
		UsingWhileLoop(123454321);
		int n=12321, rev=0;
		if(getReverse(n, rev)==n)
			System.out.println("Polindrome");
		else
			System.out.println("Not Polindrome");

	}
	
	public static void UsingWhileLoop(int n) {
		int temp,rev=0;
		temp=n;
		while(n>0) {
			rev = rev*10+n%10;
			n=n/10;
		}
		if(rev == temp) {
			System.out.println("Polindrome");
		}
		else {
			System.out.println("Not Polindrome");
		}
	}
	
	public static int getReverse(int n, int rev) {
		if(n==0) {
			return rev;
		}
		rev = rev*10+n%10;
		return getReverse(n/10, rev);
	}

}
