package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

public class FB_HackerCup_B {

	public static void main(String[] args) throws NumberFormatException, IOException {
  
		BufferedReader br = new BufferedReader(new FileReader("New.txt"));
		
		int t = Integer.parseInt(br.readLine());
		int C =1;
		while(t-->0)
		{
			StringTokenizer line = new StringTokenizer(br.readLine());
			int GP = Integer.parseInt(line.nextToken());
			int GC = Integer.parseInt(line.nextToken());
			int GF = Integer.parseInt(line.nextToken());
			int n = Integer.parseInt(br.readLine());
			
			int[]p = new int[n];
			int[]c = new int[n];
			int[]f = new int[n];
		
					
			for(int i = 0 ; i <n ;++i)
			{
				line = new StringTokenizer(br.readLine());
				p[i]=Integer.parseInt(line.nextToken());
				c[i]=Integer.parseInt(line.nextToken());
				f[i]=Integer.parseInt(line.nextToken());
				
			}
			if(sum(p,c,f,n,0,0,0,GP,GC,GF))
			{
				System.out.println("Case #"+C+": yes");
			}
			
			else
				System.out.println("Case #"+C+": no");
			
			C++;
		}
	}
	
	static boolean sum (int []S ,int[]S2,int[]S3,int n , int sum1,int sum2,int sum3,int GP, int GC, int GF)
	{
		
         for(long i = 0; i < (1<<n); i++){
			sum1 =0;
			sum2=0;sum3=0;
		    for(int j = 0; j < n; j++){
		        if(( i&1 << j) > 0){ // bit j is on
		           sum1 +=S[j];
		           sum2 +=S2[j];
		           sum3 +=S3[j];
		        		   
		        }
		    }
		  if(sum1== GP && sum2 == GC && sum3 == GF)return true;
		}
  
  return false;
 
  
      

	}
}
