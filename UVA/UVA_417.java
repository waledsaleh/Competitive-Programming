package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Vector;

public class UVA_417 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    Scanner sc = new Scanner(System.in);
      Map<String,Integer>map = new TreeMap<String,Integer>();
    int n =0;
    String con ="";
    for(char i = 'a';i<='z';++i)map.put(""+i, ++n);
    
    for(char i ='a';i<='z';++i)
	   {
	 	  for(char j =(char) (i+1);j<='z';++j)
		  {
	 		 map.put(i+""+j, ++n);
		  }
	 	  
	   }
    
     for(char i ='a';i<='z';++i)
	   {
	 	  for(char j =(char) (i+1);j<='z';++j)
		  {
	 		 for(char k =(char)(j+1);k<='z';++k)
	 		 {
	 			  map.put(i+""+j+""+k, ++n);
	 		 }
	 			 
		  }
	 	  
	   }
     for(char i ='a';i<='z';++i)
	   {
	 	  for(char j =(char) (i+1);j<='z';++j)
		  {
	 		 for(char k =(char)(j+1);k<='z';++k)
	 		 {
	 			 for(char e =(char)(k+1);e<='z';++e)
	 			 {
	 				   map.put(i+""+j+""+k+""+e, ++n);
	 			 }
	 		 }
	 			 
		  }
	 	  
	   }
    
    
    
	  for(char i ='a';i<='z';++i)
	   {
		  
	 	  for(char j =(char) (i+1);j<='z';++j)
		  {
			
			  for(char k =(char)(j+1);k<='z';++k)
			  {
				  for(char e =(char)(k+1);e<='z';++e)
				  {
					  for(char m =(char)(e+1);m<='z';++m)
					  {
						  con =i+""+j+""+k+""+e+""+m;
						  map.put(con, ++n);
						  
					  }
				  }
			  }
		  }
		  
		  
	  }
	
	while(sc.hasNext())
	{
		String res = sc.next();
		if(!map.containsKey(res))System.out.println(0);
	
		else
		System.out.println(map.get(res));
		
		
	}
		
	}
 
	
	
	
}
