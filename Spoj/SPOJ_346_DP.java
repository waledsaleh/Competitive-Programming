package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class SPOJ_346_DP{
    static long[] dp = new long[100001];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	 while(sc.hasNext()){
		 int n =sc.nextInt();
		Arrays.fill(dp, -1);
		
		System.out.println(dollar(n));
	 }
		
	}
  static long dollar(int n)
  {
	  if(n==0)return 0;
	  if(n==1)return 1;
	  if(n<100000){
	  if(dp[n] != -1)return dp[n];
	  
	  dp[n]=Math.max(n, dollar(n/2)+dollar(n/3)+dollar(n/4));
	  return dp[n];
	  }
	  return Math.max(n, dollar(n/2)+dollar(n/3)+dollar(n/4));
	  
  }
}
