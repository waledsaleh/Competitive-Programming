package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_11934 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int a ,b,c,d,l;
	while(true)
	{
	StringTokenizer st = new StringTokenizer(br.readLine());
		a=Integer.parseInt(st.nextToken());
		b=Integer.parseInt(st.nextToken());
		c=Integer.parseInt(st.nextToken());
		d=Integer.parseInt(st.nextToken());
		l=Integer.parseInt(st.nextToken());
		if(a==0&&b==0&&c==0&&d==0&l==0)break;
		int x =0;
	int count =0;
	for(int i = 0 ; i <=l;++i)
	{
		x=i;
		int res = a*x*x+b*x+c;
		if(res%d==0)
		count++;
		
	}
	
	System.out.println(count);
	
	
	}
	
	}
	
}
