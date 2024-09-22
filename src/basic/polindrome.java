package basic;

public class polindrome {

	public static void main(String[] args) {
		int n = 141, a, r, rev=0;
		a=n;
		while(n>0) {
			r= n%10;
			rev = rev*10+r;
			n=n/10;
		}
		if(rev == a) {
			System.out.println("Polindrome");
		}
		else {
			System.out.println("Not Polindrome");
	}
	

}
}
