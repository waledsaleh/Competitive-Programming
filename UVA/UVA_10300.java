package Main;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

//10300 - Ecological Premium uva

public class UVA_10300 {
	
	public static void main(String[] args)
	{
	
			
				Scanner sc = new Scanner(System.in);
				int test = sc.nextInt();
				int num , a , b , c;int mul;
				
				      while(sc.hasNext()) // End of file '.'
				      {
				    	 while(test-->0)
				    	 {
				    		 mul=0;
				    		 num = sc.nextInt();
				    		 while(num-->0)
				    		 {
				    		 a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
				    		 mul+=a*c;
				    		 
				    		 }
				    		 System.out.println(mul);
				    	 }
				    	 
				      }
				      
				      
				
				
				
	}
				
	
			

		
	}


