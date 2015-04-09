package Main;

import java.util.Arrays;
import java.util.Scanner;

public class CF_347{
 
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
	    int count =0;
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for(int i = 0; i <n ;++i)
		{
			array[i]=sc.nextInt();
			if(array[i]==i)count++;
		}
		
		for(int i =0;i<n;i++)
			if(array[i]!=i){
				if(array[array[i]]==i){
					System.out.println(count+2);
					return;
				}
			}
		
		if(count==n)
		System.out.println(count);
		else
			System.out.println(count+1);
		
	}

}
