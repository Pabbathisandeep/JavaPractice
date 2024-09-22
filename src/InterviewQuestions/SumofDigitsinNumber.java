package InterviewQuestions;

public class SumofDigitsinNumber {

	public static void main(String[] args) {
		UsingBruteforce(111);
		  int num = 12345, sum = 0;
	       System.out.println ("Sum of digits : " + getSum (num, sum));

	}
	
	public static void UsingBruteforce(int n) {
		int sum= 0;
		while(n>0) {
			sum+=n%10;
			n=n/10;
		}
		System.out.println(sum);
		}
	
	  static int getSum (int num, int sum)
	   {

	     if (num == 0)
	       return sum;

	     sum += num % 10;
	     return getSum (num / 10, sum);
	   }

}
