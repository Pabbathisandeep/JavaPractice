package basic;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		String str = "Fission Labs";
		boolean isDuplicate= false;
		for(int i=0;i<str.length();i++) {
			char currentCharacter = str.charAt(i);
			if(currentCharacter==' ') {
				continue;
			}
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(j)==currentCharacter) {
					isDuplicate=true;
					break;
				}
			}
			if(isDuplicate){
				System.out.println(currentCharacter);
				
			}
		}
		

	}

}
