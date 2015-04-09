package Main;

import java.util.Arrays;
import java.util.Scanner;

public class CF_34B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n= sc.nextInt();
		int[] array = new int[m];
		int max = 0;
		for(int i = 0 ; i <m ;++i)array[i]=sc.nextInt();
		
		Arrays.sort(array);
         for(int i = 0 ; i < n ;++i)
         {
        	 if(array[i]<0)
        	 max += -array[i];
         }
           System.out.println(max);



	}
		
		
		
		
	

}
