package InterviewQuestions;

public class CapitalizeFirstLastLetterOdeachWordOfString {

	public static void main(String[] args) {
		String str = "sandeep reddy";
		String[] words = str.split(" ");
		for(int i=0; i<words.length;i++) {
			char[] ch = words[i].toCharArray();
			ch[0] = Character.toUpperCase(ch[0]);
			ch[ch.length-1] = Character.toUpperCase(ch[ch.length-1]);
			words[i]= new String(ch);
		}
		String result = String.join(" ", words);
		System.out.println(result);
	}

}
