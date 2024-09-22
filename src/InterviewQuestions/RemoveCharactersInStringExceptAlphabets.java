package InterviewQuestions;

public class RemoveCharactersInStringExceptAlphabets {

	public static void main(String[] args) {
		String s1= "Sandeep Reddy@123$)";
	
		System.out.println(s1.replaceAll("[^a-zA-Z]", ""));
		

	}

}
