package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class TC_605 {
	public static void main (String [] args) throws IOException {
		
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
	     Scanner sc  = new Scanner(System.in);
        
	     System.out.println(getNumber("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ"));
	}     
	     

	public static int getNumber(String S)
	{
		
		
	      StringBuilder sb  = new StringBuilder(S);
	      Set<String> s= new HashSet<String>();
	      
	      
	      for(int i = 0 ; i<S.length();++i)
	      {
	    	  sb.deleteCharAt(i);
	    	  String q = sb.toString();
	    	  s.add(q);
	    	  
	    	  sb  = new StringBuilder(S);
	    	  
	      }
	      Vector<String> v = new Vector<String>(s);
	      
		return v.size();
	}
	
	
}
