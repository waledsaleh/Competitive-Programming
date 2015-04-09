package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TCO06_Round2 {

	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             

              Scanner sc = new Scanner(System.in);
               PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
              
              
               System.out.println(digitK(2,10,1));
     
              
	}
	public static int digitK(int x, int y, int k)
	{
		 BigInteger n1 = BigInteger.valueOf(x);
		 BigInteger res = n1.pow(y);
		 
		 String q = new StringBuilder(res.toString()).reverse().toString();
		 System.out.println(q);
		 if(k>q.length()-1)return -1;
		 
		 int n = Integer.parseInt(""+q.charAt(k));
		 return n;
		 
	}
}
