package basic;

public class RetrievSubstring {

	public static void main(String[] args) {
		String str = "automation(fission)@gmail.com";
		String newstr = "";
		int startsFrom = 11, endsBefore = 18;
		for(int i=startsFrom; i<endsBefore; i++) {
			newstr+= String.valueOf(str.charAt(i));
		}
		System.out.print(newstr);
		

	}

}
