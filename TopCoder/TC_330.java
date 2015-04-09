package Main;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class TC_330 {
	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
         Scanner sc  = new Scanner(System.in);
     int[] a ={5,4,3,2,1};
         System.out.println(getSortness(a));
         
         
	}
 public static 	double getSortness(int[] a)
 {

	 int count =0;
	
		
			 for(int i = 0; i < a.length;++i)
			 {
				 
		 for(int j = 0 ; j <a.length;++j)
		 {
			 if(i==j)continue;
			 
			 if(i>j&&a[i]<a[j])
			 {
			 
				 count++;
			
			 }
			 
			 else if(j>i&&a[i]>a[j])
			 {
				 count++;
				
			 }
			 
		 }
		 
			 }
			 
	
	 return (double)count/a.length;
	 
 }
	
}
