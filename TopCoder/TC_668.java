package Main;

import java.util.*;
import java.math.*;
import java.text.*;
public class TC_668 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	   System.out.println(encrypt("uogcodlk" , new int[]{4, 3, 6, 2, 5, 1, 0, 7} , 44 ));
		
		
	}
 static String encrypt(String message, int[] key, int K)
 {
	 char[]  ch = message.toCharArray();
	
	 while(K-->0)
	 {	 
		 for(int i = 0; i < key.length;++i)ch[key[i]]=message.charAt(i);
		
	 message=new String(ch).toString();
		 
	 }
	 
	 return message;
	 
	 
	 
 }
}
