package Main;

import java.util.Arrays;
import java.util.Scanner;

public class CF_337A {

	public static void main(String[] args) {
  
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int m =sc.nextInt();
		 int[] a = new int[m];
		 for(int i=0;i<m;++i)a[i]=sc.nextInt();
		Arrays.sort(a);
		
		int min = Integer.MAX_VALUE;
		for(int k = 0 ;k+n<=m;++k)
		{
			min = Math.min(min, a[k+n-1]-a[k]);
		}
	
		System.out.println(min);
		
		
	}

}
