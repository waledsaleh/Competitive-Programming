package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class TC_296 {
	public static void main(String[] args) throws IOException, Exception {
		//Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);

	System.out.println(nthElement(25));
	
	}
	static 	int nthElement(int n)
	{
		List<Integer> list =ll();
		
		return list.get(n-1);
		
	}
	public static List<Integer>ll () 
	{
		Vector<Integer>l = new Vector<Integer>();
		
		for(int i =1 ; i <=1000;++i)l.add(i);
		
		for(int i =2  ; i <=10;i++)
		{
		    	for(int j = i-1;j<l.size();j+=i)l.set(j, 0);
		    	
		    	HashSet<Integer> set = new HashSet<Integer>();
		    	for(int e = 0 ; e < l.size();++e)set.add(l.get(e));
		    	l = new Vector<Integer>(set);
		    	Collections.sort(l);
		    	l.remove(0);
		}
		
		
		return l;
	}
		
}
