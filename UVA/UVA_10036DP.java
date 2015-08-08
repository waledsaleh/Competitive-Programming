package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_10036DP {
	
	  static byte[][] dp = new byte[10005][101];
	    static int N;
	    static int[] a = new int[10005];
	    static int m;
	 
	    public static int mod(int a, int b) {
	        if (a < 0)
	            a = a + (-a / b + 1) * b;
	        return a % b;
	    }
	 
	    public static byte isDivisible(int mod, int i) {
	        if (i == N && mod != 0)
	            return 0;
	        else if (dp[i][mod] != -1)
	            return dp[i][mod];
	        else
	            return dp[i][mod] = 
	                    (byte) (isDivisible((mod + mod(-a[i], m)) % m, i + 1)|
	                    isDivisible((mod + mod(a[i], m)) % m, i + 1));
	    }
	 
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int tc = in.nextInt();
	        while (tc-- > 0) {
	            N = in.nextInt();
	            m = in.nextInt();
	            for (int i = 0; i <= N; i++)
	                for (int j = 0; j <= m; j++)
	                    dp[i][j] = -1;
	            dp[N][0] = 1;
	            for (int i = 0; i < N; i++)
	                a[i] = in.nextInt();
	            if (isDivisible(mod(a[0], m), 1) == 1)
	                System.out.println("Divisible");
	            else
	                System.out.println("Not divisible");
	        }
	    }
	 
	
}