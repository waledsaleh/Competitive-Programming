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
import java.util.Vector;

public class UVA_10887 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
	 int t =Integer.parseInt(br.readLine());
	 int count =1;
	 while(t-->0)
	 {
	 StringTokenizer st = new StringTokenizer(br.readLine());
	 int n = Integer.parseInt(st.nextToken()),m = Integer.parseInt(st.nextToken());	 
	 
		Set<String>s = new HashSet<String>(); 
		
		 String[] a = new String[n],b=new String[m];
		 int c=0,c2=0;
		 while(n-->0)
		 {
			a[c++]=br.readLine(); 
			 
		 }
		 while(m-->0)
		 {
			b[c2++]=br.readLine(); 
			 
		 }
		 for(int i = 0 ; i < a.length;++i)
		 {
			 for(int j = 0 ; j < b.length;++j)
			 {
				 s.add(a[i]+b[j]);
			 }
		 }
		
		System.out.println("Case "+count+": "+s.size());
		
		++count;
	 }
	 
	}
}
