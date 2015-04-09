package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF_82A{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
 		String [] ans = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
              
	 	   int n = sc.nextInt();
	 	   
	      n--;
	      while(n>=5)
	      {
	    	  n -=5;
	    	  n /=2;
	    	  
	      }
		System.out.println(ans[n]);
		
		
	}
	
	
	
	

}
