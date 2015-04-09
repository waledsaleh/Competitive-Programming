package Main;

import java.math.BigInteger;
import java.util.Collections;
import java.util.Vector;

public class TC_246_400 {

	public static void main(String[] args) {

		System.out.println(split("112",13));
		
		
	}
 static String split(String conglutination, int expectation)
 {

	 for(int i = 1 ; i < conglutination.length(); ++i)
	 {
		try{
			String f =conglutination.substring(0,i);
		String s = conglutination.substring(i);
		Long A =Long.parseLong(f,10),B=Long.parseLong(s,10);	
		
	 if(A+B==expectation)return f+"+"+s;
		}catch(Exception ex)
		{
			
		}
	 }
	 return "";
  	 
 }

}
