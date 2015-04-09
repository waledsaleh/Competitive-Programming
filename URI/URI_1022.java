package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class URI_1022
{
	public static void main(String[] args) throws IOException,Exception {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      
		    Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("");
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int test=Integer.parseInt(br.readLine());
		while(test-->0)
		{
		     
			         String[] lineToken = br.readLine().split("[\\s]");
			         
			      String   operacao = lineToken[3];
			         int a1 = Integer.parseInt(lineToken[0]);
			         int a2 = Integer.parseInt(lineToken[2]);
			         int b1 = Integer.parseInt(lineToken[4]);
			         int b2 = Integer.parseInt(lineToken[6]);

			         double x1, x2;
			         
			         if (operacao.equals("*")) {
			            x1 = a1 * b1;
			         } else if (operacao.equals("/")) {
			            x1 = a1 * b2;
			         } else if (operacao.equals("+")) {
			            x1 = (a1*b2) + (a2*b1);
			         } else {
			            x1 = (a1*b2) - (a2*b1);
			         }
			         
			         x2 = operacao.equals("/") ? a2 * b1 : a2 * b2;
			
			         if((int)(x2/GCD(x1,x2))<0 && (int)(x1/GCD(x1,x2))>0)
			        bw.write(((int)x1+"/"+(int)x2+" = "+-1*(int)(x1/GCD(x1,x2))+"/"+Math.abs((int)(x2/GCD(x1,x2))))+"\n");
			        else
			        	bw.write(((int)x1+"/"+(int)x2+" = "+(int)(x1/GCD(x1,x2))+"/"+(int)(x2/GCD(x1,x2)))+"\n");
		
		}
		bw.flush();
		bw.close();
	}

	public static double GCD(double a , double b)
	{
		if(a==0||b==0)return a+b;
		
		return GCD(b,a%b);
		
	}
	public static BigInteger pow(BigInteger a, int n)
	{
		if(n==0)return BigInteger.ONE;
		if(n==1)return a;
		BigInteger t = pow(a,n/2);
		
		return t.multiply(t.multiply(pow(a,n%2)));
	}


	}
	
	

