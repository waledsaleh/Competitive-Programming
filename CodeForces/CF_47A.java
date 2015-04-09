package Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class CF_47A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		
  // int[] a= tran(500);
		int n = sc.nextInt();
		for (int i = 1; i <= n; n++)
		{
		    if (i * (i + 1) / 2 == n)
		    {
		        System.out.println("YES\n");
		        return;
		    }
		}
		System.out.println("NO\n");
		
	}
    
	/*public static int[]tran(int n )
	{
		int[] num = new int[1000];
		for(int i = 0 ; i <=n;++i)
		{
			num[i]=i*(i+1)/2;
		}
		return num;
	}
	*/
}
