package JavaPrograms.NaveenAutomationLabs;

public class IntegerPrograms {
	
	public static void main(String[] args) {
		reverseNumber(1546849);
		swapTwoNumbers(2,3);
		PrimeNumber(19);
		armstrongnumber(153);
		factorial(5);
		System.out.println(factorialRecursive(5));
		print1to100withoutusinganynumber();
		print1to100withoutusingloop(1);
	}
	
	public static void reverseNumber(int n) {
		int rev=0;
		while(n>0) {
			rev = rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);
	}
	
	public static void swapTwoNumbers(int a, int b) {
		a = a+b; //a = a*b  //x = x^y
		b=a-b;  //b = a/b   //y = x^y
		a=a-b;  //a = a/b   //x = x^y
		System.out.println(a+" "+b);
	}
	
	public static void PrimeNumber(int n) {
		boolean flag = true;
		if(n>1) {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					flag = false;
					break;
				}
				else {
					flag=true;
				}
			}
			if(flag) {
				System.out.println("Prime nuber");
			}else {
				System.out.println("Not Prime Number");
			}
		}else {
			System.out.println("Lowset prime number is 2");
		}
	
	}
	
	public static void armstrongnumber(int n) {
		int arm = 0, temp;
		temp=n;
		while(n>0) {
			int r = n%10;
			arm = arm+r*r*r;
			n=n/10;
		}
		if(arm==temp) {
			System.out.println("armstrong number");
		}else {
			System.out.println("not armstrong number");
		}
	}
	
	public static void factorial(int n) {
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
	
	public static int factorialRecursive(int n) {
		int fact=1;
		if(n==0) {
			return 1;	
		}else
			return (n*factorialRecursive(n-1));
	}
	
	public static void print1to100withoutusinganynumber() {
		int one = 'A'/'A';
		for(int i=one;i<='d';i+=one) {
			System.out.println(i);
		}
	}
	
	public static void print1to100withoutusingloop(int n) {
		if(n<=100) {
			System.out.println(n);
			n++;
			print1to100withoutusingloop(n);
		}
		
	}
	
	
	

}
