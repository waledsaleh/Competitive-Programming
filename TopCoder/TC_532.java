package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class TC_532 {

	public static void main (String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
		 Scanner sc  = new Scanner(System.in);
		int[]a = {7, 4, 77, 47, 74, 44};
		 System.out.println(minDucks(a));
	}
	public static int minDucks(int[] ducks)
	{
		
		int count =0;
		Arrays.sort(ducks);
		int min = ducks[0];
		int max = ducks[ducks.length-1];
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0 ; i <ducks.length;++i)set.add(ducks[i]);
		Vector<Integer> v=  new Vector<Integer>();
		for(int i = min ; i <=max;++i)v.add(i);
		for(int i = 0 ; i < v.size();++i)
		{
			if(!set.contains(v.get(i)))count++;
			
		}
		return count;
		//There are another good solution
		
		/* one formula exit o(1)
   		 * return ducks[ducks.length-1]-ducks[0]-ducks.length+1 ;                      
		 * 
		 */
		
	}
}
