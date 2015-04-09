package Main;

import java.util.Scanner;

public class CF_157A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	   int  n = sc.nextInt();
	   int[] r = new int[n];
	   int[] c = new int[n];
	   
	   for(int i =0; i < n; ++i){
		   for(int j=0 ; j <n ;++j){
			   int x = sc.nextInt();
		     r[i] +=x;
		     c[j] +=x;
		   }
	   }
	   
	   int count =0;
	   for(int i = 0 ; i <n;++i)
	   {
		  for(int j=0; j <n;++j)
			  if(r[i]<c[j])count++;
		 
	   }
	   System.out.println(count);
	   
	   
	}
	
 
  
}
