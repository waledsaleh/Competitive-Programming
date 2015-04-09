package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Find_Distict_Pair {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int test =Integer.parseInt(br.readLine());
	   
	   while(test-->0)
	   {
		   int n = Integer.parseInt(br.readLine());
		   int[]array = new int[n];
		   StringTokenizer st = new StringTokenizer(br.readLine());
		   for(int i = 0 ; i < n;++i)array[i]=Integer.parseInt(st.nextToken());
		   int count =0;
		  int[]pos = new int[1000001];
		  int[]neg = new int[1000001];
		  pos[0]=0;
		  for(int i = 0 ; i < n;++i)
		  {
			  if(array[i]>=0)pos[array[i]]++;
			  else
				  neg[-array[i]]++;
		  }
		  for(int i = 0 ; i<=1000000;++i)
		  {
			  if(pos[i]>0)count +=(pos[i]*(pos[i]+1)>>1);
			  if(neg[i]>0)count +=(neg[i]*(neg[i]+1)>>1);
			  
		  }
		 sb.append(count+"\n");
		 
		 
	   }
		
		System.out.print(sb);
		
	}

}
