package InterviewQuestions;

public class toggleEachCharacterInString {

	public static void main(String[] args) {
		String str = "SanDeeP";
		String str2="";
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				str2 = str2+Character.toLowerCase(str.charAt(i));
			}else {
				str2 = str2+Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(str2);

	}

}
