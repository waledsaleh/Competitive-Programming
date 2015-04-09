package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.Vector;

public class UVA_11849 {

	
public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		if(n==0&&m==0)break;
		Set<Integer> s = new HashSet<Integer>();
		int count =0;
		Set<Integer> s2 = new HashSet<Integer>();
		int[] a1 = new int[n];
		int[] a2 = new int[m];
		
		
		for(int  i = 0 ; i <n;++i)s.add(Integer.parseInt(br.readLine()));
		for(int  i = 0 ; i <m;++i)
		{
			if(s.contains((Integer.parseInt(br.readLine()))))count++;
		
		}
		
		System.out.println(count);
		
		
		}
}


}
