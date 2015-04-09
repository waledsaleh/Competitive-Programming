package Main;

import java.io.IOException;

import java.util.InputMismatchException;

import java.util.Scanner;


//A. Life Without Zeros  codeforces

public class CF_75A{

	public static void main(String[] args) throws IOException {

		
	Scanner sc = new Scanner(System.in);
	
	StringBuilder sb ,sb2,sb3;
	
	
	String a1,b1;
	int A=sc.nextInt(),B=sc.nextInt();
	int c= A+B;
	
	//System.out.println(c);
	
	String c1 =String.valueOf(c);
	String conv_c1=c1.replaceAll("0", "");
//	System.out.println(conv_c1);
a1=String.valueOf(A);
	String conv_a1=a1.replaceAll("0", "");
	//System.out.println(conv_a1);
	b1=String.valueOf(B);
	String conv_b1=b1.replaceAll("0", "");
	//System.out.println(conv_b1);
	if(Integer.parseInt(conv_a1)+Integer.parseInt(conv_b1)==Integer.parseInt(conv_c1))
	{
		System.out.println("YES");
	}
	else
		System.out.println("NO");
	}
	
	
	}	
	



	/*	int pow =0;
		int n =sc.nextInt(),p=sc.nextInt();
		for(int i =p;i<=n;i*=p)
		{
			pow+=n/i;
		}
	
	
	
		System.out.println(pow);*/