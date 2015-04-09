package Main;

import java.util.HashSet;
import java.util.Scanner;

public class CF_25B {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
	 String res ="";
       int n =sc.nextInt();
       String numbers = sc.next();
       if(n==2||n==3)System.out.println(numbers);
       else
       {
    	  
    	   int count =2;
    	   if((n&1)==0)
    	   {
    		   int i=0;
    		   for(;count<=numbers.length();count+=2)
    		   {
    		  res +=numbers.substring(i,count); 
    		  if(count!=numbers.length())res +='-';
    		   
    		   i=count;
    		   }
    	   }
    	   else
    	   {
    		   count =2;
    		   int i=0;
    		   for(;count<=numbers.length()-3;count+=2)
    		   {
    		  res +=numbers.substring(i,count); 
    		  if(count!=numbers.length()-3)res +='-';
    		   
    		   i=count;
    		   }
    		  res +='-';
    		   res +=numbers.substring(i,numbers.length());
    		   
    	   }
       }
		System.out.println(res);
	}

}
