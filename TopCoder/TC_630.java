package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TC_630 {

	public static void main(String[] args) throws IOException {
 
		 System.out.println(ableToSolve("aabbbcccaaaabbbcccaaabbbcccaaabbbcccaaabbcccaaabbccccbaaabccccccccccccaaabcccccbaaacbcbccaaabcbac"));
		
		
	
	}
   static String ableToSolve(String S)
   {
	   if(S.length()==1)return "Impossible";
	 
	  boolean f= false;
	  for(int  j =0;j<100;++j)
	  {
		   char[] ch = S.toCharArray();
	   for(int i = 0 ; i < ch.length-1;++i)
	   { 
		   
		   if(ch[i]==ch[i+1])
		   {
			   ch[i]=' ';
			   ch[i+1]=' ';
			   
		   }
		   
	   }
	   S="";
	   for(int i = 0 ; i < ch.length;++i)S +=ch[i];
	   S =S.replaceAll(" ", "");
	   
	  if(S.equals("")){f=true;break;}
	  else
		  f=false;
	 
	  
	  }  
	  if(f)return "Possible";
	   return "Impossible";
	  
   }
	
}
