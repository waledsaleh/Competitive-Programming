package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class CF_230B {

	public static void main(String[] args) throws  IOException {

		 Scanner sc = new Scanner(System.in);
	        int N = 1000000;
	        boolean[] p = new boolean[N+1];
	        Arrays.fill(p, true);
	        p[0]=p[1]=false;
	        Set<Long> set = new HashSet<Long>();
	        for(int i=2;i<=N;i++)if(p[i]){
	            set.add(1L*i*i);
	            for(int j=i+i;j<=N;j+=i)p[j]=false;
	        }
	        int n = sc.nextInt();
	        while(n--!=0)System.out.println(set.contains(sc.nextLong())?"YES":"NO");
	  
	  
	}
	
}
