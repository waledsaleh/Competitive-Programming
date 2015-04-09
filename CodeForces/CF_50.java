package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF_50 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	
	 int n = sc.nextInt();
	    int m = sc.nextInt();
	    
	    int count =0;
	    
	    int mul = n*m;
	    
	    while(m !=0)
	    {
	        if(mul <=0)break;
	        else if(mul ==1)break;
	        mul -=2;
	        count++;
	        
	        
	        
	    }
	    
	    System.out.println(count);
	    
	
	}
	
	

}
