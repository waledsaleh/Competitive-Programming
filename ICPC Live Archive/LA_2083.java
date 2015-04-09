package Main;

import java.util.Scanner;

public class LA_2083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("n e");
		System.out.println("- -----------");
		double sum = 0.0;
		for(int i = 0 ; i <=9;++i)
		{
			sum += 1/fact(i);
			if(i==0||i==1)System.out.println(i+" "+(int)sum);
			
			else if(i==2)System.out.printf("%d %.1f\n",i,sum);
			
			else
			System.out.printf("%d %.9f\n",i,sum);
			
		}
		
	}

	public static double fact(int n)
	{
		if(n==0)return 1;
		
		double f = 1;
		for(int i =2 ; i <=n;++i)f *= i;
		
		return f;
		
	}
	
}
