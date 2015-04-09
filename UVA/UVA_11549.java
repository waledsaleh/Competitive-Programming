package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

public class UVA_11549 {
	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
     int test = Integer.parseInt(br.readLine());
     long n;long k;
     Set<Long>s ;
     
     while(test-->0)
     {
    	 StringTokenizer st = new StringTokenizer(br.readLine());
    	 s= new HashSet<Long>();
   n=Integer.parseInt(st.nextToken());
    	 k=Integer.parseInt(st.nextToken());
    	 long max =0;
    	do
    	 {
    		 s.add(k);
    		
    		 max = Math.max(max, k);
    		 k = k*k;
    		   String snum = String.valueOf(k); 
    		 int slen = snum.length();
    		
    		if(slen>n)
    		{
    		
    			k /= (int)Math.pow(10, slen-n);
    			
    		}
    		
    	 }while(!s.contains(k));
    	
    	 System.out.println(max);
    	
     }
     
	}
	
}
