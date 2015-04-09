package Main;

import java.util.Scanner;

public class CF_463B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		             
		    int n = sc.nextInt();
		    int energy=0,min=0;
		    int[] arr = new int[n+1];
		    arr[0]=0;
		    for(int i = 1; i < arr.length ; ++i)arr[i]=sc.nextInt();
		    for(int i = 0 ; i <n ;++i)
		    {
		    	energy +=arr[i]-arr[i+1];
		    	min = Math.min(min, energy);
		    	
		    }
		    System.out.println(-min);
		  
	}

}
