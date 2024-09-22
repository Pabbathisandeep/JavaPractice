package InterviewQuestions;

public class RemoveVowelsfromString {

	public static void main(String[] args) {
		String str = "SandeepA";
		String str2 = "";
		str = str.toLowerCase();
		str2 = str.replaceAll("[aeiou]", "");
		System.out.println(str2);
		

	}

}
