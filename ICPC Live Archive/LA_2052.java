package Main;

import java.util.Scanner;
import java.util.Vector;

public class LA_2052 {
	
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
		  int test = sc.nextInt();
		  while(test-->0)
		  {
       int x = sc.nextInt();
       int y = sc.nextInt();
   
   		if(x!=y && x-2!=y)
   		System.out.println("No Number");
   		else if(x==y)
   		System.out.println(x*2-(x&1));
   		else
   		System.out.println(x*2-(x&1)-2);
   		
		  }
		  
	}
	
}
