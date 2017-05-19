package Main;

import java.text.*;
import java.util.*;

public class TC_690 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
   
		System.out.println(check("AAAAAA"));
	
		
	}
	static String check(String S)
	{
		
		if((S.length()&1)!=0)return "not square";
		
		return (S.substring(0,S.length()/2).equals(S.substring(S.length()/2))?"square":"not square");
		
	}

}


