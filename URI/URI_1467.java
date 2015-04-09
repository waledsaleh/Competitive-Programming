package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class URI_1467 
 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	 int a , b , c;
     
	    while(sc.hasNext())
	    {
	        a=sc.nextInt();
	        b=sc.nextInt();
	        c=sc.nextInt();
	         
	        if(a==b&&a==c)
	        {
	            System.out.println("*");
	        }
	        else if(a==c)
	        {
	            System.out.println("B");
	        }
	        else if(b==c)
	            System.out.println("A");
	        else
	            System.out.println("C");
	    }
	         
	    
	     
	
	
	}

}
