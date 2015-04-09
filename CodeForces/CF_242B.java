package Main;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class CF_242B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			Vector<String>v = new Vector<String>();
		int n = sc.nextInt();
		int min =Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		
		for(int i = 0 ; i < n ;++i)
		{
			int l = sc.nextInt(),r=sc.nextInt();
			if(l<min)min=l;
			if(r>max)max = r;
			v.add(l+" "+r);
			
		}
		
	for(int i = 0 ; i < v.size();++i)
	{
		if(v.elementAt(i).equals(min+" "+max))
		{
			System.out.println(i+1);return;
		}
	}
	System.out.println(-1);	
	
	
	
	}

}
