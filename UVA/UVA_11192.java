package Main;

import java.util.Scanner;

public class UVA_11192 {

	public static void main(String[] args) {
		
	       Scanner sc= new Scanner(System.in);
           while(true)
           {
           	int n =sc.nextInt();
           	if(n==0)return;
           	String word = sc.next();
           	int mult = word.length()/n;
           	String res ="";
           	int first =0;
           	int sec =mult;
           	for(int i= 0 ; i <n;++i)
           	{
           		String sub = word.substring(first,sec);
           		first =sec;
           		sec +=mult;
           		sub = new StringBuilder(sub).reverse().toString();
           		res +=sub;
           	}
           	System.out.println(res);
           }
		
		

	}

}
