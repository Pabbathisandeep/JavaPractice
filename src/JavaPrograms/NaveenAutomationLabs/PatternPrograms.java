package JavaPrograms.NaveenAutomationLabs;

public class PatternPrograms {

	public static void main(String[] args) {
		PyramidPattern(5);
		ReversePyramid(5);
		LeftHalfPyramid(5);
		TrianglePattern(10);
		AlphabetsPattern(5);
		AlphabetPattern2(5);
	}
	
	public static void PyramidPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void ReversePyramid(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	
	public static void LeftHalfPyramid(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void TrianglePattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	public static void AlphabetsPattern(int n) {
		int alpha = 65;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
	}
	
	public static void AlphabetPattern2(int n) {
		int alpha = 65;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(alpha)+" ");
			}
			alpha++;
			System.out.println();
		}
	}

}
