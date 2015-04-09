package Main;

import java.util.*;
import java.io.*;

import javax.swing.text.html.MinimalHTMLWriter;

public class TC_272 {
	
  public static void main(String[] args) throws Exception {
             
	   Scanner sc = new Scanner(System.in);
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	   System.out.println(minDistance(new String[]{"000000", "000111", "111000", "111111"}));
	   
  }
  
  public static int minDistance(String[] numbers)
  {
	  int min = Integer.MAX_VALUE;
	  for(int i = 0 ; i < numbers.length-1;++i)
	  {
		  int count =0;
		  String first = numbers[i];
		  for(int k = i+1 ; k <numbers.length;++k)
		  {
		  String sec= numbers[k];
		  
		  for(int j = 0 ;j<first.length();++j)
		  {
			  if(first.charAt(j)!=sec.charAt(j))count++;
		  }
		  min = Math.min(min, count);
		  count=0;
		  
		  }
		 
			  
	  }
	  
	  return min;
	  
  }
  
}
