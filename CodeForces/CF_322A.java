package Main;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class CF_322A{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int m = sc.nextInt();
	  System.out.println(n+m-1);
	
	   for(int i = 1 ; i <=m;++i)
	   {
		 System.out.println(1+" "+(i));
	   }
	   for(int i = 2 ; i <=n;++i)
	   {
		 System.out.println(i+" "+(1));
	   }

		
	}

	
	
}
