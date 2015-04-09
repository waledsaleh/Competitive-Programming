package Main;

import java.math.BigInteger;
import java.util.Scanner;

public class UVA_108DP {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(sc.hasNext())
		{
		int n = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int[][] arr = new int[n][n];
		
		for(int i = 0 ; i <n;++i)
		{
			for(int j = 0 ; j <n ;++j)
			{
				arr[i][j]=sc.nextInt();
				if (i > 0) arr[i][j] += arr[i - 1][j]; // if possible, add values from top
				if (j > 0) arr[i][j] += arr[i][j - 1]; // if possible, add values from left
				if (i > 0 && j > 0) arr[i][j] -= arr[i - 1][j - 1]; // to avoid double count
			}
			
		}
		
		int subRect;
		for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) // start coord
			for (int k = i; k < n; k++) for (int l = j; l < n; l++) { // end coord
			subRect = arr[k][l]; // this is sum of all items from (0, 0) to (k, l): O(1)
			if (i > 0) subRect -= arr[i - 1][l]; // O(1)
			if (j > 0) subRect -= arr[k][j - 1]; // O(1)
			if (i > 0 && j > 0) subRect += arr[i - 1][j - 1]; // inclusion-exclusion: O(1)
			max = Math.max(max, subRect);
			}
		
		
		System.out.println(max);
		
		}
	}
	
}
