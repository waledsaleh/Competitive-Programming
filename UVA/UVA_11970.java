package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_11970 {
	
	public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 StringBuilder sb = new StringBuilder("");
		 
		int test= Integer.parseInt(br.readLine());
		int n;
		for(int t =1 ; t <=test;++t)
		{
			n=Integer.parseInt(br.readLine());
			
			int i =(int) Math.sqrt(n-1);
		   // StringBuilder sb = new StringBuilder("");
		    sb.append("Case "+t+": ");
		    
			for(;i>=1;--i)
			{
				int mul = i*i;
				int result = n-mul;//i/(;
				
				if(result%i==0)
				{
					sb.append(result+" ");
				}
				
			}
			sb.deleteCharAt(sb.length()-1);
			sb.append("\n");
			 
			
		}
		
		System.out.print(sb);
	}
	
}
