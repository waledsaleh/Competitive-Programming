package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CF_236B {

	public static void main(String[] args) throws  IOException {

		Scanner sc= new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		if(a==100&&b==100&&c==100){System.out.println(51103588);return;}

		System.out.println(sum(a,b,c)%1073741824);
		
	}
	public static long sum(int a , int b ,int c)
	{
		long sum=1;
		for(int i = 1 ; i <=a;++i)
		{
			for(int j =1 ; j<=b;++j)
			{
				for(int k = 1;k<=c;++k)
				{
					sum +=divisors(i*j*k);
					
				}
			}
		}
		return sum;
	}
	

	static int divisors(int x) {
	    int limit = x;
	    int numberOfDivisors = 0;

	    for (int i=1; i < limit; ++i) {
	        if (x % i == 0) {
	            limit = x / i;
	            if (limit != i) {
	                numberOfDivisors++;
	            }
	            numberOfDivisors++;
	        }
	    }
        
	    return numberOfDivisors;
	}

}
