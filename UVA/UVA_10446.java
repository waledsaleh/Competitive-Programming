package Main;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class UVA_10446 {

	static BigInteger[][] dp;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count =1;
		while(true)
		{
			dp = new BigInteger[100][100];
		for(int i = 0 ; i < dp.length;++i)for(int j = 0 ; j < dp.length;++j)dp[i][j]=BigInteger.valueOf(-1);
			
		int n =sc.nextInt();
		if(n>60)break;
		int b = sc.nextInt();
		
		System.out.println("Case "+count+": "+times(n,b));
		
		count++;
		
		}
		
		
	}
  
	public static BigInteger times(int n , int b)
	{
		if(n<=1)return BigInteger.ONE;
		
		if(dp[n][b].compareTo(BigInteger.valueOf(-1)) !=0) return dp[n][b];
	
			dp[n][b]=BigInteger.ONE;
		for(int i =1 ; i <=b;++i)
			dp[n][b] =dp[n][b].add(times(n-i,b));
		
		return dp[n][b];
	}
	
}
