package Main;

import java.util.Arrays;

public class TCHS07_SemiFinals_DIV1 {

	public static void main(String[] args) {

		
		System.out.println(sort(123456789));
		
		
		
	}
 static int sort(int x)
 {
	 char[] ch = String.valueOf(x).toCharArray();
	 Arrays.sort(ch);
	 String res = new StringBuilder(new String(ch)).reverse().toString();
	
	 return Integer.parseInt(res);
 }
 
 
}
