package Main;

public class TC_147 {

	public static void main(String[] args) {

		System.out.println(decode(
				
				"TOPCODER",1));
	
	}
 static String decode(String cipherText, int shift)
 {
	 String res = "";
	
	 for(int i  = 0; i <cipherText.length();++i)
	 {
			 res += (char)(((cipherText.charAt(i)-'A'+26-shift)%26)+'A');
	 }
	 
	 
	 return res;
 }
 
 
 
}
