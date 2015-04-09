package Main;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class TC_255_500 {

	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
         Scanner sc  = new Scanner(System.in);
      
         String[] listA={"cat", "dog", "pig", "mouse"};
         String[] listB={"cat", "pig"};
         String[] listC={"dog", "cat"};
         
     System.out.println(score(listA,listB,listC)); 
     
	}

		public static String score(String[] listA, String[] listB, String[] listC)
		{
			
			Set<String> set_a= new HashSet<String>();
			Set<String> set_b= new HashSet<String>();
			Set<String> set_c= new HashSet<String>();
			for(String j : listA)set_a.add(j);
			for(String j : listB)set_b.add(j);
			for(String j : listC)set_c.add(j);
			
			
			String key ="";
	
			return get(listA,listB,listC,set_b,set_c)+"/"+get(listB,listA,listC,set_a,set_c)+"/"+get(listC,listA,listB,set_a,set_b);
		}
		public static int get(String[] listA, String[] listB, String[] listC,Set<String>set_b,Set<String>set_c)
		{
			int score_1=0;
			int sa=0;
			for(int i = 0 ; i < listA.length;++i)
			{
				score_1=3;
				if(set_b.contains(listA[i]))score_1--;
				if(set_c.contains(listA[i]))score_1--;
				sa +=score_1;
			}
			
			
			
			return sa;
		}
}
