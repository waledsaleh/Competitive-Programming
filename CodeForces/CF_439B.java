package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class CF_439B {

	public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer line =new StringTokenizer(br.readLine());
     
		int n = Integer.parseInt(line.nextToken());
		int h = Integer.parseInt(line.nextToken());
		line =new StringTokenizer(br.readLine());
		Vector<Integer>v = new Vector<Integer>();
		for(int i = 0 ; i < n ;++i)v.add(Integer.parseInt(line.nextToken()));
		
		Collections.sort(v);
		
		long res =0;
		StringBuilder sb = new StringBuilder("");
		for(int i = 0 ; i < n ;++i)
		{
			if(h >=1){res +=(long)h*v.elementAt(i);h--;}
			else
				res +=v.elementAt(i);
			
		}
		System.out.print(res);
		
	}

}
