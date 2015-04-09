package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TC_340 {
	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
         Scanner sc  = new Scanner(System.in);
        
         System.out.println(getCamelized("top-border-width"));
         
         
	}
	public static String getCamelized(String cssPropertyName)
	
	{
		 String[] split = cssPropertyName.split("-");
		 String res ="";
		 res +=split[0];
		 if(split.length>1){
		 for(int i=1;i<split.length;++i)
		 {
			char ch = Character.toUpperCase(split[i].charAt(0));
			split[i]=new StringBuilder(split[i]).deleteCharAt(0).toString();
			 split[i]=ch+""+split[i];
			 res +=split[i];
		 }
		 
		 }
		 return res;
		
	}
}
