package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class CF_61A {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String f = sc.next(),s=sc.next();
     for(int i = 0 ; i < f.length();++i)
     {
    	 if(f.charAt(i)!=s.charAt(i))System.out.print(1);
    	 else
    		 System.out.print(0);
     }
		
	}
	
	
}
