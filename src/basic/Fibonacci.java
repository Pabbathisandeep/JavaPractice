package basic;

public class Fibonacci {

	public static void main(String[] args) {
		int n=8, first=0, second = 1, next;
		for(int i=0;i<n;i++) {
			System.out.print(first+ " ");
			next = first+second;
			first = second;
			second = next;
		}

	}

}
