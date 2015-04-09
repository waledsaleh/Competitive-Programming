package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;


public class CF_266B   {
	
	   public static void main(String[] args) throws  IOException {
		  Scanner sc = new Scanner(System.in);
		  
		  int n = sc.nextInt();
		  int t = sc.nextInt();
		  String word = sc.next();
		 char[]ch ;
          while(t-->0)
          {  ch = word.toCharArray();
        	  for(int i = 1 ; i < n;++i)
        	  {
        		  if(word.charAt(i)=='G' && word.charAt(i-1)=='B')
        		  {
        			  char temp = ch[i];
        			  ch[i]=ch[i-1];
        			  ch[i-1]=temp;
        			  
        		  }
        		  
        	  }
        	  word="";
        	  for(int i = 0 ;i<ch.length;++i)word +=ch[i];
        	  
          }
         
		   System.out.println(word);
	}

}

