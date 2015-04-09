package Main;

import java.util.Scanner;

public class TC_148 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	  System.out.println(howMany(999999999));

			 
		
	  
	}
	
	
   static 	int howMany(int number)
   {
	
	   int org=number,div=0,count=0;
	  
	   while(number != 0)
	   {
		    div = number%10;
		    number /=10;
            if(div==0) continue;  		   
            if(org%div==0)count++; 
	   }
	   return count;
	   
   }
   
   
   
}
