package basic;

public class primeNumber {

	public static void main(String[] args) {
		int n=60, m=0, flag=0;
		m= n/2;
		if(n==1||n==0) {
			System.out.println("Smallest prime no is 2");
		}
		else {
		for(int i=2;i<=m;i++) {
			if(n%i==0) {
				System.out.println("not a prime");
				flag=1;
				break;
			}}
			if(flag==0) {
				System.out.println("prime");
			}
		}

	}}
