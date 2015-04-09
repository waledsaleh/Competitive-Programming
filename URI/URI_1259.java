package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class URI_1259 {
public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 
	   
	   
	    	int n = Integer.parseInt(br.readLine());
	    	int[] a1 = new int[n];
	    	
	    	for(int i = 0 ; i <n;++i)a1[i]=Integer.parseInt(br.readLine());
	    	
	    	List<Integer>l1 = new ArrayList<Integer>();
	    	
	    	List<Integer>l2 = new ArrayList<Integer>();
	    	for(int i = 0 ; i <a1.length;++i)
	    	{
	    		if((a1[i]&1)==0)
	    		{
	    			l1.add(a1[i]);
	    		}
	    		else
	    			l2.add(a1[i]);
	    		
	    	}
	    	
	    	Collections.sort(l1);
	    	Collections.sort(l2);
	    	Collections.reverse(l2);
	    	List<Integer>result = new ArrayList<Integer>();
	    	
	    	for(int i = 0 ; i<l1.size();++i)result.add(l1.get(i));
	    	for(int i = 0 ; i<l2.size();++i)result.add(l2.get(i));
	    	
	    	for(int i = 0 ; i<result.size();++i)bw.write(result.get(i)+"\n");
	    	
	   
		 bw.flush();
}

 
}
