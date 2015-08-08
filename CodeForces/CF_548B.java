package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CF_548B{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()),m= Integer.parseInt(st.nextToken()),
				q= Integer.parseInt(st.nextToken());
		int[][] a = new int[n][m];
		int[] a2 = new int[n];
		
		for(int i =0 ; i <n;++i)
		{
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j <m;++j)a[i][j]=Integer.parseInt(st.nextToken());
			a2[i]=calcuMax(a[i]); 
		}
		StringBuilder sb = new StringBuilder("");
		while(q-->0)
		{
		
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken())-1,j=Integer.parseInt(st.nextToken())-1;
			a[i][j] ^=1;
			a2[i] = calcuMax(a[i]);
			
				sb.append(GetMax(a2)).append("\n");
		}
	System.out.print(sb);
	
		
		
		
	}
  static int calcuMax(int []a)
  {
	  int max=0;
	  int count =0;
		for(int e = 0 ; e <a.length;++e)
		{
			if(a[e]==1)count++;
			else
			{
				max = Math.max(max, count);
				count =0;
			}
		}
	max = Math.max(max, count);
	return max;
	
	
  }
  static int GetMax(int [] a)
  {
	        int res = a[ 0 ];
	        for( int q : a )
	            res = Math.max( res, q );
	        
	        return res;
	    
  }

}
