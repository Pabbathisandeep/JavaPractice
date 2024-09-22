package InterviewQuestions;

public class checkCharacterIsAlphabet {

	public static void main(String[] args) {
		char c = '5';
		if((c>='a'&& c<='z')||(c>='A' && c<='Z')) {
			System.out.println(c+" is aplhabet");
		}else {
			System.out.println(c+" is not alphabet");
		}

	}

}
