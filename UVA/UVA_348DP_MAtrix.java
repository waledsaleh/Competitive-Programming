package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class UVA_348DP_MAtrix {
   
	 static final int MAXN = 10 + 5;
	    static final int INF = 2000000000;
	    static int N;
	    static int[][] M = new int[MAXN][2];
	    static int[][] cost = new int[MAXN][MAXN];
	    static int[][] pos = new int[MAXN][MAXN];
	    static StringBuffer ans = new StringBuffer();
	    
	    public static void main(String[] args) throws IOException
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st;
	        int tc = 0;
	        
	        while(true)
	        {
	            N = Integer.parseInt(br.readLine().trim());
	            if(N == 0) break;
	            
	            for(int i = 0; i < N; i++){
	                Arrays.fill(M[i], 0);
	                Arrays.fill(cost[i], 0);
	                Arrays.fill(pos[i], 0);
	            }
	            for(int i = 0; i < N; i++){
	                st = new StringTokenizer(br.readLine());
	                M[i][0] = Integer.parseInt(st.nextToken());
	                M[i][1] = Integer.parseInt(st.nextToken());
	            }
	            for(int l = 1; l <= N; l++){
	                for(int i = 0; i <= N - l; i++){
	                    int j = i + l - 1;
	                    cost[i][j] = INF;
	                    if(i == j) cost[i][j] = 0;
	                    for(int k = i; k < j; k++){
	                        int tmp = cost[i][k] + cost[k + 1][j] + M[i][0] * M[k][1] * M[j][1];
	                        if(tmp < cost[i][j]){
	                            cost[i][j] = tmp;
	                            pos[i][j] = k;
	                        }
	                    }
	                }
	            }
	            ans.append("Case "+(++tc)+": ");
	            print(0, N-1);
	            ans.append("\n");
	        }
	        System.out.print(ans);
	    }
	 
	    static void print(int l, int r)
	    {
	        if(l == r){
	            if(l != N - 1){
	                ans.append("A"+(l + 1));
	            }
	            else{
	                ans.append("A"+(r + 1));
	            }
	        }
	        else
	        {
	            ans.append("(");
	            print(l, pos[l][r]);
	            ans.append(" x ");
	            print(pos[l][r] + 1, r);
	            ans.append(")");
	        }
	    }
  
}
