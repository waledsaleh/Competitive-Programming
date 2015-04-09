package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class TC_617 {
	public static void main (String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
	     Scanner sc  = new Scanner(System.in);
	 
	    int[] a =solve(25);
	     for(Integer j : a)System.out.print(j+" ");
	     
	}
	
	static  int[] solve(int n)
	{
		
		Vector<Integer> v  = new Vector<Integer>();
		
		boolean f = false;
		
		for(int i = 4 ; i <n;++i)
		{
			f= false;
			for(int j = i+1 ; j <n;++j)
			{
				if(i+j==n)
				{
		           		for(int e = 2 ; e <i;++e)
		           		{
		           			if(i%e==0)
		           			{
		           				f=true;
		           				break;
		           			}
		           			else
		           			{
		           				f=false;
		           			
		           			}
		           		}
		           		if(f)v.add(i);
		           		
		           		f=false;
		           		
		           		for(int e = 2 ; e <j;++e)
		           		{
		           			if(j%e==0)
		           			{
		           				f=true;
		           				break;
		           			}
		           			else
		           			{
		           				f=false;
		           				
		           			}
		           		}

				   if(f)
					v.add(j);
					
				}
				
			}
			
		}
		int first = 0;
		int sec = 0;
		f= false;
		for(int i = 0 ; i < v.size();++i)	
		{
			for(int j = i +1 ; j < v.size();++j)
			{
				if(v.get(i)+v.get(j)==n)
				{
					f=true;
					first= v.get(i);
					sec = v.get(j);
				break;			
				}
			}
			if(f)break;
		}
		int[] a = new int[2];
		a[0]=first;
		a[1]=sec;
		return a;
	}
	
}
