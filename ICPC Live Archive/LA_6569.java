package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LA_6569 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 Scanner sc = new Scanner(System.in);
		 int count =1;
		 
	      while(true)
	      { 
	    	  ArrayList<Character> line1 =new ArrayList<Character>();
	    	    ArrayList<Character> line2 =new ArrayList<Character>();
	    	
	    	    String s1 = sc.next();
	    	    String s2 = sc.next();
	    	  char[] word1 = s1.toCharArray();
	    	  char[] word2 = s2.toCharArray();
	    	  
	    	  Arrays.sort(word1);
	    	  Arrays.sort(word2);
	    	  
	    	  for(int i = 0 ; i < word1.length;++i)line1.add(word1[i]);
	    	  for(int i = 0 ; i < word2.length;++i)line2.add(word2[i]);
	      
	    	  if(s1.equals("END")&&s2.equals("END"))break;
	    	  
	    	  boolean check  = false;
	       if(line1.size()>=line2.size())
	       {
	    	   for(int i = 0;;)
	    	   {
	    		   if(line2.size()==0&&line1.size()==0)break;
	    		   if(line2.contains(line1.get(i)))
	    		   {
	    			   line2.remove(line1.get(i));
	    			   line1.remove(line1.get(i));
	    			   check = true;
	    		   }
	    		   else
	    		   {
	    			   check = false;
	    			   break;
	    		   }
	    		   
	    	   }
	    	   
	       }
	       else
	       {
	    	   for(int i = 0;;)
	    	   {
	    		   if(line2.size()==0&&line1.size()==0)break;
	    		   if(line1.contains(line2.get(i)))
	    		   {
	    			   line2.remove(line1.get(i));
	    			   line1.remove(line1.get(i));
	    			   check = true;
	    		   }
	    		   else
	    		   {
	    			   check = false;
	    			   break;
	    		   }
	    	   }
	    	   
	       }
	       if(check)System.out.println("Case "+count+": same");
	       else
	    	   System.out.println("Case "+count+": different");
	       ++count;
	    	  
	      }
		
		
		
	}
	
}
