package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class LA_2759 {

	public static void main(String[] args) throws IOException {

		//File f= new File("Common Subsequence.in");
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 int[][] array ;//= new int[5000][5000];
		 
	      String s1,s2;
	      
	      while(sc.hasNext())
	      {
	    	
	    	  s1=sc.next();
	    	  s2 = sc.next();
	    	
	    	//  if(s1==null&&s2==null)break;
	    	    array = new int[s1.length()+1][s2.length()+1];
	    	  int len1=s1.length();
	    	  int len2=s2.length();
	    	for(int i =1 ; i <=s1.length();++i) 
	    	{
	    		for(int j =1 ; j <=s2.length();++j)
	    		{
	    			if(s1.charAt(i-1)==s2.charAt(j-1))
	    				array[i][j]=1+array[i-1][j-1];
	    			else
	    				array[i][j]=Math.max(array[i-1][j], array[i][j-1]);
	    		}
	    	}
	    	  System.out.println(array[len1][len2]);
	    	  
	    	  
	    	  
	      }
		
		
		}
   



}
