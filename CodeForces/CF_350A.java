package Main;

import java.util.Arrays;
import java.util.Scanner;

public class CF_350A {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 //v = min(ai), p = max(ai), c = min(bi). So, if max(2 * v, p) < c, then answer is max(2 * v, p), else answer is  - 1.
		int n = sc.nextInt();
		int m =sc.nextInt();
		int[] array = new int[n];
		int[] array2 = new int[m];
		
		for(int i = 0 ;  i < n ; ++i)array[i]=sc.nextInt();
		
		for(int i = 0 ; i < m ; ++i)array2[i]=sc.nextInt();
		
		Arrays.sort(array);
		int v =array[0];
		int p = array[n-1];
		
		Arrays.sort(array2);
		int c = array2[0];
		if(Math.max(2*v, p)<c)System.out.println(Math.max(2*v, p));
		else
			System.out.println(-1);
	}
	
	
}
