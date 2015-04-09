package Main;

import java.io.*;
import java.util.HashSet;
import java.util.IllegalFormatException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class UVA_729 {
 static HashSet<String>set = new HashSet<String>();
 
	public static void main(String[] args) throws FileNotFoundException {
		 Scanner sc = new Scanner(System.in);
	        int dataset=sc.nextInt();
	        for(int i=0;i<dataset;i++){
	          if(i!=0)
	            System.out.println();
	          int N=sc.nextInt();
	          int H=sc.nextInt();
	          String temp="";
	          for(int j=0;j<(1<<N);j++){
	               boolean stat=Integer.bitCount(j)==H;
	               if(stat) 
	                   temp=Integer.toBinaryString(j);
	               for(int z=temp.length();z<N;z++)
	                   temp="0"+temp;
	               if(stat)
	                System.out.println(temp);
	               
	          }
	        }
	}
	public static void combString(String s) {
	    set.add(s);
	    char[] a = s.toCharArray();
	    int n = a.length;
	    int[] p = new int[n]; 
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
