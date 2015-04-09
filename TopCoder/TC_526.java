package Main;

import java.util.Collections;
import java.util.HashSet;
import java.util.Vector;

public class TC_526 {

	public static void main(String[] args) {

		
		int[]res = howMany("AAABBB");
		for(int j : res)System.out.print(j+" ");
		
		
		
	}
	static int[] howMany(String answers)
	{
		Vector<Character>v = new Vector<Character>();
		
		Vector<Integer>res = new Vector<Integer>();
		int count =0;
		for(int i = answers.length()-1 ; i >=0;--i)
		{
			if(v.contains(answers.charAt(i)))
					{
		    	v.add(answers.charAt(i));
		    	  res.add(count);      
		    	
					}
			else
			{
				count++;
			res.add(count);

			v.add(answers.charAt(i));
	    	
			}
		}
		Collections.reverse(res);
		int[]r = new int[res.size()];
		for(int i = 0 ; i < v.size();++i)r[i]=res.elementAt(i);
		return r;
		
	}
}
