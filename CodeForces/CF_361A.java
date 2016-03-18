package Main;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CF_361A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt(),k=sc.nextInt();
	   int[][]ar = new int[n][n];
	   for(int i = 0 ; i <n;++i)   ar[i][i]=k;
		
		for(int i = 0 ; i <n;++i)   
		{
			for(int j = 0 ; j <n;++j)
			{
			    if(j==0)System.out.print(ar[i][j]);
			    else
			    	System.out.print(" "+ar[i][j]);
			}
			System.out.println();
		}
		
	}
	
}
