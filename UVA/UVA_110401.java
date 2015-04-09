package Main;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 110401 Vito’s Family

public class UVA_110401 {
	
	public static void main(String[] args) throws IOException {
	
	Scanner sc = new Scanner(System.in);

	
int t=sc.nextInt();int[]array;int r;
	for(int i =1 ; i <=t;i++)
	{
		r=sc.nextInt();
		array = new int[r];
		for(int s = 0 ; s<r;s++)
		{
			
			array[s]=sc.nextInt();
			
		}
		Arrays.sort(array);;
		  int sum=0;
          int mid=0;
         
        
          if(array.length%2==1)
            mid=array[array.length/2];
          else
            mid=(array[array.length/2]+array[(array.length+1)/2])/2;
          for(int j=0;j<array.length;j++){
            sum+=Math.abs(mid-array[j]); 
          }
		System.out.println(sum);
	
	}
	
	
	}
	
}

