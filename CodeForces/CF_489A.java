package Main;

import java.util.Scanner;
import java.util.Vector;

public class CF_489A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int[] array = new int[n];
		Vector<IntegerPair>v = new Vector<IntegerPair>();
		for(int i = 0 ; i < n;++i)array[i]=sc.nextInt();
		
		int k=0;
		for(int i =  0 ; i < n ;++i)
		{
			int c= i;
			for(int j = i ; j <n ;++j)
				if(array[c]>array[j])
					c=j;
				
				
			IntegerPair p = new IntegerPair(i,c);
			if( i!=c )
					v.add(p);
			
			       int temp = array[i];
					array[i]=array[c];
					array[c]=temp;
		}
		//for(int j :array)System.out.print(j+" ");
	//	System.out.println();
		if(v.size()>0)
		{
			System.out.println(v.size());
			for(IntegerPair j : v)System.out.println(j.first()+" "+j.second());
		}
		else
			System.out.println(0);
		
	}

}

class IntegerPair implements Comparable {
	  Integer _first, _second;

	  public IntegerPair(Integer f, Integer s) {
	    _first = f;
	    _second = s;
	  }

	  public int compareTo(Object o) {
	    if (!this.first().equals(((IntegerPair)o).first()))
	      return this.first() - ((IntegerPair)o).first();
	    else
	      return this.second() - ((IntegerPair)o).second();
	  }

	  Integer first() { return _first; }
	  Integer second() { return _second; }
	}

