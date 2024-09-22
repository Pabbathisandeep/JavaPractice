package basic;

public class RemovingNumbers {
	
	public static void main(String[]args) {
		String str = "dffasdasd5484vfsdfcsd9f4cs9d4s9fd4";
		char[] chars = str.toCharArray();
		String aString = "";
//		String str1 = str.replaceAll("\\d","");
//		String str1 = str.replaceAll("[0-9]","");
//		String str1 = str.replaceAll("^[A-Za-z]","");
//		System.out.println(str1);	
		
		for(int i=0; i<chars.length;i++) {
			if(!Character.isDigit(chars[i]));{
				aString = aString+chars[i];
			}
			
			
		}
		System.out.println(aString);
		
////		String address = "34732483dhshdsdhajsa8ejdsdd";
////	    char[] chars = address.toCharArray();
////	    String aString = "";
////
////	    for (int i = 0; i < chars.length; i++) {
////	        if (!Character.isDigit(chars[i])) {
////	            aString =aString + chars[i]; 
////
////
////	        }
//
//	    }System.out.println(aString);

	}
	

}
