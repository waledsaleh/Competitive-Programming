package Main;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Vector;

public class CF_447A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Vector<Integer >v = new Vector<Integer>();
		Vector<Integer >v2 = new Vector<Integer>();
		int p =sc.nextInt();
		int n = sc.nextInt();
		boolean f= false;
		int index =0;
		for(int j=0 ;j<n ;j++)
		{
			int num = sc.nextInt();
			
				if(v2.contains(num%p))
				{
				index =j+1;
				f=true;
				break;
				}
			
		v2.add(num%p);	
			
		}
		if(f)System.out.println(index);
		else
		System.out.println(-1);
		
		
		
	}

}
