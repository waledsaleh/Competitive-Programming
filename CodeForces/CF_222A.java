package Main;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class CF_222A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt()-1;
		 Set<Integer> s = new HashSet<Integer>();
		int[] a = new int[n];
		 
		 for(int i = 0 ; i < n;++i){a[i]=sc.nextInt();}
		 for(int i = k ; i < n;++i){s.add(a[i]);}
         int c = 0;
         if(s.size()>1){ System.out.println(-1); return; }
        
		 for(int i = k-1 ; i >=0 ; --i)
		 {
			
			if(a[i] != a[k])
			{
				c = i+1;
				break;
			}
			
		 }
	  System.out.println(c);
	  
	  
		
		 
	}

}
