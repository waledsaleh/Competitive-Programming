package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class CF_ {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//Scanner sc = new Scanner(System.in);
	
	int test = Integer.parseInt(br.readLine());
	for(int i =1 ; i <=test;++i)
	{
		long count =0;
	String first = br.readLine();
	String[] sp = first.split(" ");
	long n1 = Long.parseLong(sp[sp.length-1]);
	
	String sec = br.readLine();
	String[] sp2 = sec.split(" ");
	
	
	long n2 = Long.parseLong(sp2[sp2.length-1]);
	
	String bin ="";
	
	long[] array = new long[(int) n2+1];
	int counta=0;
	for(long e = n1 ; e<=n2;++e )
	{
		array[counta]=e;
		counta++;
		
	}
	
	
	
	/*for(long j = n1;j<=n2;j++)
	{
		if((j%100)==0)
		{
            continue;
			
		}
		if((j%4)==0)
		{
		count++;
		}
		
		
	}
	
	System.out.println("Case "+i+": "+count);*/
	
	}
	
	}

}
