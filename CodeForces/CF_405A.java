package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class CF_405A {

	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             

              Scanner sc = new Scanner(System.in);

              int n = sc.nextInt();
             int[] array = new int[n];
             for(int i = 0 ; i <n;++i)array[i]=sc.nextInt();
             
             Arrays.sort(array);
              for(int j =0;j< array.length;++j)
              {
            	  if(j==array.length-1)System.out.print(array[j]);
            	  else
            		  System.out.print(array[j]+" ");
              }
	}
	
	
}
