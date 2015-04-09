package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UVA_11466 {
	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             

              Scanner sc = new Scanner(System.in);
       
              while(true)
              {
            	  long n = sc.nextLong();
            	  
            	  if(n==0)break;
              work(Math.abs(n));
              
              }
              
	}
	public static void work(long n) // prime factorization
	{
			
			List<Long>list = new ArrayList<Long>();
			long max = 0;
			for(long i = 2 ; i*i<=n;i++)
			{
				while(n%i==0)
				{
					max = Math.max(max, i);
					list.add(i);
					n/=i;
					
				}
			}
			
			if(n>1)
			{
				list.add(n);
				max = Math.max(max, n);
			}
			if(list.size()>1 && max!=list.get(0))
			System.out.println(max);
			
			else
				System.out.println(-1);
	}
	
}
