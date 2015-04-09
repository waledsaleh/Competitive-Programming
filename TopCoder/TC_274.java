package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Vector;

public class TC_274 {
	public static void main (String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
	     Scanner sc  = new Scanner(System.in);
	 
	     int[] a={1,5,5,1,6,1};
	     
	     int[] res =process(a);
	    for(Integer k :res)System.out.print(k+" ");		 
	     
	     
	}
	static int[] process(int[] sequence)
	{
		/*
		Vector<Integer> v = new Vector<Integer>();
		int[] remove = new int[sequence.length];
		int e =0;
		for(int i = sequence.length-1;i>=0;--i)
		{
			remove[e]=sequence[i];
			e++;
		}
		for(int i = 0 ; i < remove.length;++i)
		{
			for(int j = i+1 ; j < remove.length;++j)
			{
				if(remove[i]==remove[j])
				{
					remove[j]=0;
					
				}
			}
			
		}
		
		Vector<Integer> v2 = new Vector<Integer>();
	for(int i = 0 ; i < remove.length;++i)if(remove[i]>0)
		v2.add(remove[i]); 
	
		
		Collections.reverse(v2);
		int[] a = new int[v2.size()];
		for(int i = 0 ; i < v2.size();++i)a[i]=v2.get(i);
		return a;
		*/
		
		//Another good solution by using LinkedHashSet data-structure
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i = sequence.length-1;i>=0;--i)set.add(sequence[i]);
		
		Vector<Integer> v = new Vector<Integer>(set);
		Collections.reverse(v);
		int[] a = new int[v.size()];
		for(int i = 0 ; i < v.size();++i)a[i]=v.elementAt(i);
		return a;
		
	}
}
