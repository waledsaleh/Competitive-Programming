package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class UVA_10018 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
 String first;
 String sec;
     int test = Integer.parseInt(br.readLine());
     while(test-->0)
     {
    	 int n = 1;
    	 int count =0;
    	 long n1,n2;
    	 long result;
    	 StringBuilder sb = new StringBuilder("");
    	 
    	 first = br.readLine();
    	 sec = new StringBuilder(first).reverse().toString();
    	     n1 = Long.parseLong(first);
    	     n2 = Long.parseLong(sec);
    	     result =n1+n2;
    	     while(n!=0)
    	     {
    	    	 result =n1+n2;
    	     if(ispalin(String.valueOf(result)))
    	     {
    	    	 count++;
    	    	 sb.append(String.valueOf(result));
    	    	 break;
    	     }
    	     else
    	     {
    	    	 first =String.valueOf(result);
    	    	 sec = new StringBuilder(first).reverse().toString();
    	    	     n1 = Long.parseLong(first);
    	    	     n2 = Long.parseLong(sec);
    	    	 count++;
    	     }
    	     
    	     }
    	     System.out.println(count+" "+sb);
     }
 
	}
	public static boolean ispalin(String x)
	{
		
		int low = 0 ;
		int high = x.length()-1;
		while(low<high)
		{
			if(x.charAt(low)!=x.charAt(high))
			return false;
			
			low++;
			high--;
		}
		return true;
	}
}
