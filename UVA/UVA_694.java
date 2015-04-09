package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class UVA_694 {

	
public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		  int t = 1;
		  StringBuilder sb = new StringBuilder("");
		 while(true)
		 {
			 StringTokenizer st = new StringTokenizer(br.readLine());
			 
		 long n =Long.parseLong(st.nextToken());//Integer.parseInt(st.nextToken());
		 long l = Long.parseLong(st.nextToken());//Integer.parseInt(st.nextToken());
		 if(n<0&&l<0)break;
		 
		long N=n;
		long L =l;
		
		 long count_n=lenght(n,l);
		
		// t++;
		 sb.append("Case "+t+": "+"A = "+N+", limit = "+L+", number of terms = "+count_n+"\n");
		 t++;
		 }
		 System.out.print(sb);
}
public static long lenght(long x , long y)
{
	if(x==1)return 0;
	if(x>y)return 0;
	
	if((x&1)==0)return 1+lenght(x/2,y);
	
	return 1+lenght(3*x+1,y);
	
	
}

}
