package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class UVA_10083 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
	StringBuilder sb  =new StringBuilder("");
		String line;
		while((line=br.readLine())!=null)
		{
			String[] split=line.split(" ");
			long n1 = Long.parseLong(split[0]);
			long n2 = Long.parseLong(split[1]);
			long n3 = Long.parseLong(split[2]);
	if(n1==1)
	{
		sb.append("("+n1+"^"+n2+"-1"+")"+"/"+"("+n1+"^"+n3+"-1"+")"+" "+"is not an integer with less than 100 digits.\n");
		continue;
	}
	if(n2==n3) // if n2=2,n3=2,n1=2 ,so (2^2-1)/(2^2-1)=1
	{
		sb.append("("+n1+"^"+n2+"-1"+")"+"/"+"("+n1+"^"+n3+"-1"+")"+" "+"1\n");
		continue;
	}
	  if(n2%n3 !=0 || n2<n3) // if result is integer
	  {
     sb.append("(").append(n1).append("^").append(n2).append("-1)/(").append(n1).append("^").append(n3).append("-1) ").append("is not an integer with less than 100 digits.\n");
          continue;
      }
			if( (n2 - n3) * Math.log10(n1) >=100) // if result not less than 100 digits
			{
		sb.append("("+n1+"^"+n2+"-1"+")"+"/"+"("+n1+"^"+n3+"-1"+")"+" "+"is not an integer with less than 100 digits.\n");
				continue;
			}
		BigInteger res = (pow(n1,n2).subtract(BigInteger.ONE)).divide(pow(n1,n3).subtract(BigInteger.ONE));
				sb.append("("+n1+"^"+n2+"-1"+")"+"/"+"("+n1+"^"+n3+"-1"+")"+" "+res+"\n");
			
	}
		
		System.out.print(sb);
		
	}
	//Calculate Power function in o(log n)
	public static BigInteger pow(long a , long b)
	{
		if(b==0)return BigInteger.ONE;
		if(b==1)return new BigInteger(String.valueOf(a));
		BigInteger p =pow(a,b/2);
		return p.multiply(p).multiply(pow(a,b%2));
		
	}
	
}
