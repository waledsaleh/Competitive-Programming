package Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;

public class SPOJ_13392 {
	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             

              Scanner sc = new Scanner(System.in);
      
              StringBuilder sb = new StringBuilder("");
              
              int test = Integer.parseInt(br.readLine());
              while(test-->0)
              {
              long n = Long.parseLong(br.readLine());
              
              if(prime(n))
              sb.append(n+" is a prime"+"\n");
              else
            	  sb.append(n+" is not a prime"+"\n");
              }
              System.out.print(sb);
	}
	public static boolean prime(long  n)
	{
	    for(long  i = 2 ; i*i <=n;++i)
	    {
	        if(n%i==0)return false;

	    }
	    return true;
	}
	
}
