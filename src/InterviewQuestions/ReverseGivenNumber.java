package InterviewQuestions;

public class ReverseGivenNumber {

	public static void main(String[] args) {
		UsingWhileLoop(848485);
		UsingForLoop(8524);
		int n=12345, rev=0;
		System.out.println("Reversed Number "+UsingRecursion(n, rev));

	}
	
	public static void UsingWhileLoop(int n) {
		int rev=0;
		while(n>0) {
			int r = n%10;
			rev = rev*10+r;
			n=n/10;
		}
		System.out.println(rev);
	}
	
	public static void UsingForLoop(int n) {
		int r, rev=0;
		for(;n!=0;n=n/10) {
			r = n%10;
			rev = rev*10+r;
		}
		System.out.println(rev);
	}
	
	public static int UsingRecursion(int n, int rev) {
		if(n==0) {
			return rev;
		}
		rev = rev*10+n%10;
		return UsingRecursion(n/10, rev);
	}

}
