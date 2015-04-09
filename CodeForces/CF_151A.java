package Main;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class CF_151A {

	public static void main(String[] args) {
		
//        System.out.println(LetterChanges("hello*3"));
	Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt(),k=sc.nextInt(),l=sc.nextInt()
				,c=sc.nextInt(),d=sc.nextInt(),p=sc.nextInt(),nl=sc.nextInt(),np=sc.nextInt();
		
		System.out.println(count(n,k,l,c,d,p,nl,np));
		
	}
	
	public static int count(int n ,int k , int l , int c , int d,int p, int nl, int np) { 
		  
      int first = (k*l)/nl;
      int sec = d*c;
      int third = p/np;
      
      int min = Math.min(Math.min(first, sec),third )/n;
return min ;

	}
	
	
}
