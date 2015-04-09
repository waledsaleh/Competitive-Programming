package Main;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class CF_359C {
	
 final static long MOD = 1000000007;
	public static void main(String[] args) {
		  Scanner in=new Scanner(System.in);
	        int n=in.nextInt();
	        long x=in.nextLong();
	        long a[]=new long[n];
	        long sum=0;
	        for (int i=0;i<n;i++){
	            a[i]=in.nextLong();
	            sum+=a[i];
	        }
	        PriorityQueue<Long> hh=new PriorityQueue<Long>();
	        for (int i=0;i<n;i++){
	            hh.add(sum-a[i]);
	        }
	        long max=0,ge=0;
	        while(!hh.isEmpty()){
	            long s=hh.poll();
	            max=max>s?max:s;
	            ge=1;
	            boolean tell=true;
	            while (ge!=x){
	                if (!hh.isEmpty()){
	                    long g=hh.poll();
	                    if (g!=s) {tell=false;break;}
	                    ge++;
	                }else{
	                    tell=false;break;
	                }
	            }
	            if (tell) hh.add(s+1); else break;
	        }
	        if (max>sum) max=sum;
	        System.out.println(power(x, max, 1000000007));
		
		
	   	
  
	}
	
	

 static int power(long x,long n,long k)
 {    //  x^n % k
     long res=1;
     while (n>0){
         if (n%2==0){
             x=(x*x)%k;
             n/=2;
         }else{
             n--;
             res=(res*x)%k;
         }
     }
     return (int)(res%k);
 }

}
