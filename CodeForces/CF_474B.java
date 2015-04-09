package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class CF_474B {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Vector<IntegerPair>v = new Vector<IntegerPair>();
		IntegerPair p ;
		int n = Integer.parseInt(br.readLine());
		String numbers =br.readLine();
		StringTokenizer st = new StringTokenizer(numbers);
		
		int sum =0;
		for(int i  = 0  ; i <n ;++i)
		{
			 sum +=Integer.parseInt(st.nextToken());
			 
			if(i==0)
			v.add(new IntegerPair(1,sum));
			else
			v.add(new IntegerPair(v.elementAt(i-1)._second+1,sum));	
			
		}
		
		int m = Integer.parseInt(br.readLine());
		numbers =br.readLine();
		st = new StringTokenizer(numbers);
		StringBuilder sb = new StringBuilder("");
		for(int i = 0 ; i < m;++i)
		{
			int num = Integer.parseInt(st.nextToken());
			int index = BS(v,num);
			if(index !=-1)sb.append((index+1)+"\n");
			
		}
		System.out.print(sb);
		
	}
  public static int BS(Vector<IntegerPair>v , int num)
  {
	int low = 0,high = v.size()-1;  
	  while(low <= high)
	  {
		  int mid = (low+high)>>1;
		  if(num >=v.get(mid)._first)
		  {
			 if(num <=v.elementAt(mid).second())return mid; 
			 else
				 low =mid+1;
		  }
			  
		  else if(num < v.elementAt(mid).first())high = mid-1;
		  else
			  low = mid+1;
	  }
	  return -1;
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
