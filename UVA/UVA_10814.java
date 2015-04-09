package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_10814 {

	public static void main (String [] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
	   
    Scanner sc = new Scanner(System.in);
    
    int test = Integer.parseInt(br.readLine());
    while(test-->0)
    {
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    BigInteger n1 = new BigInteger(st.nextToken());
    String operator =st.nextToken();
    BigInteger n2 = new BigInteger(st.nextToken());
    
    
    // To reduce the fraction ,
    //first get GCD between them,
    //Second divide first number on GCD between them and second number also
    
    BigInteger gcd = n1.gcd(n2);
    
    System.out.println(n1.divide(gcd)+" / "+n2.divide(gcd));
    
    
    }
    
}


}
