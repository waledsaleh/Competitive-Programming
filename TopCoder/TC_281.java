package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TC_281 {

	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
         Scanner sc  = new Scanner(System.in);
     
      String q = "645455262083420D918834751939957R259096548487819O";
      
      System.out.println(decode(q));
      
    		  
	}

     public static String decode(String text)
     {
	 String res = "";
	 long l = 0;
	// BigInteger bg = new BigInteger("");
	 
	 String con ="";
	 for(int i = 0 ; i <text.length();++i)
	 {
		
		// if(res.length()>50)return "TOO LONG";
		 
		 if(text.charAt(i)>='0'&&text.charAt(i)<='9')
		 {
			 con +=text.charAt(i);
		 }
		 else if(con.length()>=9&&con.length()<=2000)return "TOO LONG";
		 
		 else if(con.length()>20)return "TOO LONG";
		 
		 else if(con.equals(""))
		 {
			 char c = text.charAt(i);
			 for(long j =1 ; j <=1;++j)res +=c;
		 }
		 else
		 {
			 char c = text.charAt(i);
			 l = Long.parseLong(con);
			 for(long j =1 ; j <=l;++j)res +=c;
			 con = "";
		 }
	 }
	 if(res.length()>50)return "TOO LONG";
	 
	 
	 return res;
	 
      }
		  
}