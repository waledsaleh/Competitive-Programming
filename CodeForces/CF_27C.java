package Main;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class CF_27C {
      
       
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	  int n =sc.nextInt();
	  int[]array = new int[n];
	  Vector<Integer>v = new Vector<Integer>();
	  for(int i = 0 ; i < n ;++i)array[i]=sc.nextInt();
	  
		boolean f=false,f2=false;
		
	  for(int i = 1 ; i <array.length;++i)
	  {
		 
			      if(array[i-1]<array[i]&&!f)
			      {

			    	  v.add(i);
			    	  v.add(i+1);
			    	  f=true;
			    	
			      }
			      if(array[i-1]>array[i]&&!f2)
			      {
			    	  
			    	  v.add(i);
			    	  v.add(i+1);
			    	  f2=true;
			      }
		
		
	  }
	 
	  if(!f||!f2)
	  {
		   System.out.println(0);
		 
	  }
	  else{
		  System.out.println(3);
		 
		  System.out.print(v.elementAt(0)+" "+v.elementAt(2)+" "+v.elementAt(3));
	  }
	  
	}
	
	
}
