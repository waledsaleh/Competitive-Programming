package Main;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class CF_496A {

	public static void main(String[] args) {

Scanner sc= new Scanner(System.in);
		
		int  n = sc.nextInt();
		Vector<Integer>array =new Vector<Integer>(n);
		for(int i=0 ; i < n; ++i)array.add(sc.nextInt());
		
		Vector<Integer>v = new Vector<Integer>();
		for(int i =1 ; i <n-1;++i)
		{
			int get = array.elementAt(i);
			array.remove(i);
			int max=Integer.MIN_VALUE;
		    for(int j =1; j <n-1;j++)
		    {
		    	 max = Math.max(max,array.elementAt(j)-array.elementAt(j-1));
		    	
		    }
			v.add(max);
			array.add(get);
			Collections.sort(array);
		}
		Collections.sort(v);
		System.out.println(v.elementAt(0));
		
		
		
	}

}
