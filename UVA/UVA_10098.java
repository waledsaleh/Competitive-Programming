package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class UVA_10098 {
 static HashSet<String>set =new HashSet<String>();
 
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int test = Integer.parseInt(br.readLine());
	   StringBuilder sb = new StringBuilder("");
	   while(test-->0)
	   {
		   String word = br.readLine();
		  combString(word);
		  Vector<String>v = new Vector<String>(set);
		  Collections.sort(v);
		  for(String j : v)sb.append(j+"\n");
		  set = new HashSet<String>();
		 sb.append("\n");
	   }
	   System.out.print(sb);
	}
	public static void combString(String s) {
	    set.add(s);
	    char[] a = s.toCharArray();
	    int n = a.length;
	    int[] p = new int[n];  // Index control array initially all zeros
	    int i = 1;
	    while (i < n) {
	        if (p[i] < i) {
	            int j = ((i % 2) == 0) ? 0 : p[i];
	            swap(a, i, j);
	            // Print current
	            set.add(join(a));
	            p[i]++;
	            i = 1;
	        }
	        else {
	            p[i] = 0;
	            i++;
	        }
	    }
	}

	private static String join(char[] a) {
	    StringBuilder builder = new StringBuilder();
	    builder.append(a);
	    return builder.toString();
	}

	private static void swap(char[] a, int i, int j) {
	    char temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}

}
