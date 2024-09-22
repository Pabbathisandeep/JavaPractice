package InterviewQuestions;

public class checkcCharacterVowelorConsonant {

	public static void main(String[] args) {
		char c = 'E';
		c= Character.toLowerCase(c);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("character "+c+" is vowel");
		}else {
			System.out.println("character "+c+" is consonant");
		}

	}

}
