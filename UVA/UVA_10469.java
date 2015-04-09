package Main;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

//10469 - To Carry or not to Carry

public class UVA_10469 {

	
	public static void main(String[] args) throws IOException {

	
		Scanner sc = new Scanner(System.in);
int n1,n2;
		 try{
		      while(sc.hasNext()) // End of file '.'
		      {
		    	  n1=sc.nextInt();n2=sc.nextInt();
		         int result =n1^n2;
		System.out.println(result);
		      }
		      }catch(InputMismatchException e) // Except handle
		      {
		    	  
		      }
		
		
		
	}
	
}
