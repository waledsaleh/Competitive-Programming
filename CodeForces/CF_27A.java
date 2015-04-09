package Main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class CF_27A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Vector<Integer>v=new Vector<Integer>();
		
		for(int i = 0 ; i < n ;++i)v.add(sc.nextInt());
		Collections.sort(v);
		
		for(int i = 1; i <=100000;++i)
		{
			int index = Collections.binarySearch(v, i);
			if(index<0){System.out.println(i);break;}
		}
		
		
		
	}

}
