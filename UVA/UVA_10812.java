package Main;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_10812  {

	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	
int n = Integer.parseInt(br.readLine());//sc.nextInt();
int n1,n2;
while(n-->0)
{
	StringTokenizer st = new StringTokenizer(br.readLine());
	n1 =Integer.parseInt(st.nextToken());
	n2=  Integer.parseInt(st.nextToken());
	
	int first =0,sec=0;
	long max =0;
	long min =0;
	
	if(n1<n2||(n1+n2)%2!=0)
	{
		System.out.println("impossible");
	}
	else
	{
		first = (n1+n2)/2;
		sec = (n1-n2)/2;
		max = Math.max(first, sec);
	min = Math.min(first, sec);
	System.out.println(max+" "+min);
	}
	
	
		
	
}
  
	
	}
	
		  
	
}
