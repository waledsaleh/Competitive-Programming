package Main;

import java.util.Arrays;
import java.util.Scanner;

public class CF_160B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		String number = sc.next();
	
		String first="",sec="";
		
		for(int i = 0,j=(2*len>>1) ;i<(2*len)>>1 ;++i,j++ )
		{
			first += number.charAt(i);
			sec   +=  number.charAt(j);
		}
		char[] ch1 = first.toCharArray();
		char[] ch2 = sec.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean f= false,f2=false;;
		
		for(int i = 0,j=0 ;i<ch1.length ;++i,j++)
		{
		if(ch1[i]<ch2[j] && !f2)f=true;
		else if(ch1[i]>ch2[j] && !f)f2=true;
		else
		{
			f=false;
			f2=false;
			break;
		}
			
			
		}
	if(f||f2)System.out.println("YES");
	else
		System.out.println("NO");
		
		
		
		
	}

}
