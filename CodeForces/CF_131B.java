package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.naming.BinaryRefAddr;

public class CF_131B {

	
	public static void main(String[] args) throws  IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] count = new long[21];
		for(int i = 0 ; i <n ;++i)
		{
			count[Integer.parseInt(st.nextToken())+10]++;
		      	
		}
		
		       long sum =0;
				for(int i = 0; i <10;++i)sum +=(count[i]*count[20-i]);
				
				sum +=(long)(count[10]*(count[10]-1))/2;
				
				
		System.out.println(sum);
		
	}
 
	
	
}
