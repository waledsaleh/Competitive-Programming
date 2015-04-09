package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class URI_1028 {


	public static void main(String[] args) throws IOException {
	Locale.setDefault(Locale.US);
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);

	R.init(System.in);

	int test = R.nextInt();
	int a,b;
	for(int i = 1 ; i <=test;++i)
	{
		a=R.nextInt();
		b=R.nextInt();
		
	System.out.println(GCD(a,b));
	
	
	}
	
	}
	public static int GCD(int a , int b)
	{
		
		
		//o(n) Eculid algorithm
	/*	if(a%b==0)return b;
		
		for(int i = b/2 ; i >=1;--i)
		{
			if(a%i==0 && b%i==0)
			{
			gcd=i;
			break;
			}
			
		}
		return gcd;*/
		if(b==0)return a;
		else
			return GCD(b,a%b);
		
	}
	
	
	
}


