package Main;

import java.util.Scanner;

public class CF_214A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n  = sc.nextInt();
		int m = sc.nextInt();
		int count =0;
		for(int i =0 ; i <=1000;++i)
		{
			for(int j = 0 ; j <=1000;++j)
			{
				if(Math.pow(i, 2)+j==n && Math.pow(j, 2)+i==m)count++;
				
			}
		}
		
		
		System.out.println(count);
		
	}

}
