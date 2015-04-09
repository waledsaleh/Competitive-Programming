package Main;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Vector;

public class LA_2389 {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		
     while(true)
     {
    	 int n = sc.nextInt();
    	 if(n==0)break;
    	 String con="";
    	 Vector<Integer>v= new Vector<Integer>();
    	 for(int i =2 ; i <=16;++i)
    	 {
    	 String q = Integer.toString(n, i);
    	  if(pal(q)){con +=i;
    	  con +=" ";
    	  
    	  }
    	 }
    
    	if(!con.equals(""))
    	{	 con = new StringBuilder(con).deleteCharAt(con.length()-1).toString();
    		System.out.println("Number "+n+" is palindrom in basis "+con);
    	}
    	else
    		System.out.println("Number "+n+" is not palindrom");
     }
		
	}
   public static boolean pal (String num)
   {
	   int low=0,high=num.length()-1;
	   while(low<=high)
	   {
		   if(num.charAt(low) != num.charAt(high))return false;
		     low++;
		   high--;
		 
	   }
	   return true;
   }
}
