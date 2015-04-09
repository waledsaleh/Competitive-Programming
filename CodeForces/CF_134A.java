package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class CF_134A {

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int n =Integer.parseInt(br.readLine());
		int sum =0;
		int[] array = new int[n];
		String nums = br.readLine();
		StringTokenizer st = new StringTokenizer(nums);
		for(int i = 0 ;  i < n ;++i)
		{
			array[i]=Integer.parseInt(st.nextToken());
		
			sum +=array[i];
		}
		
		StringBuilder sb = new StringBuilder("");
		
		Vector<Integer>v=new Vector<Integer>();
		
		for(int i = 0 ; i <n ;++i)
		{
			if(array[i]*(n-1)==sum-array[i])v.add(i+1);
		}
		if(v.size()>0)
		{
			sb.append(v.size()+"\n");
			for(int i = 0 ; i<v.size();++i)sb.append(v.elementAt(i)+" ");
			System.out.print(sb);
		}
		else
			System.out.println(0);
	}

}
