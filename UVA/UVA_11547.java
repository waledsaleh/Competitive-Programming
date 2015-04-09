package Main;

import java.io.IOException;
import java.util.Scanner;

public class UVA_11547 {
	
	
//11547 - Automatic Answer
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int t= sc.nextInt();int n;int result;
		for(int i =1 ; i <=t;i++)
		{
			n=sc.nextInt();
			result=0;
			result+=((((((n*567)/9)+7492)*235)/47)-498);
			
		
			String number=String.valueOf(result);
			char last =number.charAt(number.length()-2);
			System.out.println(last);
			
		}
		
		
	}
	
}
