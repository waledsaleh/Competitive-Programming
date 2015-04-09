package Main;

import java.util.Scanner;

public class CF_139A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =0;
		int[] a = new int[7];
		for( i = 0; i < 7 ;++i)a[i]=sc.nextInt();
		while(true)
		{	
		
		for( i =1 ; i <=7;++i)
		{
	
			if(n-a[i-1]<=0)
			{
				System.out.print(i);return;
			}
			n -=a[i-1];
		}
		
		}
		
	
		
		
	}

}
