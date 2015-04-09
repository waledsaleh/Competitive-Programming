package Main;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class TC_250 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		
		 System.out.println(getOhms(new String[]	

{ "orange", "red", "blue" }));
		 
		
	}
	static long getOhms(String[] code)
	{
		List<String>m1 =Arrays.asList(new String[]{"black","brown","red","orange","yellow","green",
				"blue","violet","grey","white"}) ;
		
		long res = 1;
	     res = (m1.indexOf(code[0])*10L+m1.indexOf(code[1]))*(long)Math.pow(10, m1.indexOf(code[2]));
	     
	 return res;
		
	}
	
	
}

