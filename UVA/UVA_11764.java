package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class UVA_11764 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	

	  int test = sc.nextInt();int n =0;int[] array;
	   for(int c = 1;c<=test;++c)
	   {
		   n=sc.nextInt();
		  
		   
		   array = new int[n];
		   
		   for(int i = 0 ; i <n;++i)array[i]=sc.nextInt();
		    int high=0,low=0;
		   for(int i = 1 ; i <n;++i)
		   {
			   if(array[i-1]<array[i])
			   {
				   high++;
				   
				   
			   }
			   else if(array[i-1]==array[i]){continue;}
			   else
				   low++;
			   
		   }
		   
		   
		   System.out.println("Case "+c+": "+high+" "+low);
		   
	   }
	
	
}
	
}
