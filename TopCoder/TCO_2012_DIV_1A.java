package Main;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TCO_2012_DIV_1A {

	public static void main (String [] args) throws IOException {
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
         Scanner sc  = new Scanner(System.in);
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       String[] players={ "elly", "kriss", "stancho", "elly", "stancho" };
       
       String[] res = getWinners(players);
       for(String j : res)System.out.print(j+" ");


	}
	
	 public  static String[] getWinners(String[] players)
	 {
		 int count =1;
		 Set<String>s = new HashSet<String>();
		 
		 if(players.length==1)return players;
		 
		 for(int i = 0 ; i < players.length;++i)
		 {
			 count =1;
			 String q = players[i];
			 for(int j = 0 ; j < players.length;++j)
			 {
				 if(i==j)continue;
				 if(q.equals(players[j]))count++;
				 
			 }
			 if(count>1)s.add(q);
		 }
		 Vector<String>v = new Vector<String>(s);
		 
		 String[] res = new String[v.size()];
		 for(int i = 0 ; i < res.length;++i)res[i]=v.get(i);
		 
		 bubble(res);
		 return res;
		 
	 }
	 public static void bubble(String[] s)
	 {
		 for(int i = 0 ; i < s.length;++i)
		 {
			 for(int j = i+1;j<s.length;++j)
			 {
				 if(s[i].compareTo(s[j])>0)
				 {
					 String temp = s[i];
					 s[i]=s[j];
					 s[j]=temp;
							 
				 }
			 }
		 }
	 }
}
