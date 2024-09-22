package InterviewQuestions;


public class PrimeNumber {

	public static void main(String[] args) {
		Prime(29);
		UsingOptimizationByBreak(1);
		int lower = 2, upper = 10;
		 for (int i = lower; i <= upper; i++)
		       if (isPrime (i))
		        System.out.println (i);
		   }

	
	public static void Prime(int n) {
		int m = n/2;
		int flag= 0;
		if(n==0 || n==1) {
			System.out.println("Smallest prime number is 2");
		}
		else {
		for(int i=2;i<=m;i++) {
			if(n%i==0) {
				flag = 1;
				break;
			}
		}

	 if(flag==1) {
			System.out.println("Not a Prime Number");
		}
		else {
			System.out.println("Prime Number");
		}
	}
	}
	
	public static void UsingOptimizationByBreak(int n) {
		boolean isprime = true;
		if(n<2) {
			isprime = false;
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					isprime = false;
					break;
				}
			}
		}
		String result = isprime? "Prime": "Not a Prime";
		System.out.println(result);
	
	
	}
	
	 static boolean isPrime (int n)
	   {
	     // 0, 1 negative numbers are not prime
	    if (n < 2)
	       return false;

	     // checking the number of divisors b/w 1 and the number n
	     for (int i = 2; i < n / 2; i++)
	       {
	      if (n % i == 0)
	        return false;
	       }

	     // if reached here then must be true
	     return true;
	   }
	 }



