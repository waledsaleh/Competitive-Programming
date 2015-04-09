package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TC_352 {
public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		String[] s ={"Mansi", "Arjun", "Nikhil", "Taneja"};
		String[] a ={"PPPPMPPAPP", "AAMAAPP", "PPPPAAP", "PPPAAAMPP"};
		String[] r =shortList(s,a);
		for(String j : r)
		System.out.print(j+" ");
}
	
  public static String[] shortList(String[] names, String[] attendance)
  {
	     List<String>list = new ArrayList<String>();
	                
	       int count_p=0;
	       int count_A=0;
	       if(names.length==1&&names[0]=="")
	       {
	    	   return names;
	       }
	       
	       int index =0;
	       //int j = 0;
	       for(int i = 0 ; i <names.length;++i)
	       {
	    	   count_p=0;
	    	   count_A=0;
	    	   for( int j =0;  j<attendance[i].length();++j)
	    	   {
	    		   if(attendance[i].charAt(j)=='P')
	    			{
	    			   count_p++;
	    		    }
	    		  
	    		  else if(attendance[i].charAt(j)=='A')
	    		  {
	    			  count_p++;
	    			  count_A++;
	    		  }
	    	   }
	    	  
    	   if((count_A*100)/count_p>25)
    	   {
    		   list.add(names[i]);
    	   }
    	   
    	 
	    	
	       }
	      
	       String[] s = new String[list.size()];
	       for(int i = 0 ; i <s.length;++i)s[i]=list.get(i);
	     
	       return s;
	  
  }
  
  
  
}

