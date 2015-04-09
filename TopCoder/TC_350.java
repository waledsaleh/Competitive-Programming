package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_350 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	String f = br.readLine();
	String q = br.readLine();
	String e = br.readLine();
	System.out.println(getDistance(f,q,e));
	
	}
	public static int getDistance(String first , String second , String letterset)
	{
		int count1=0;
		int count2=0;
		int res=0;
		
		first = first.toLowerCase();
		second = second.toLowerCase();
		String s1=new StringBuilder(second).reverse().toString();
		
		
		for(int i = 0 ; i <letterset.length();++i)
		{
		char c = letterset.charAt(i);
		count1=0;count2=0;
		for(int  j = 0 ; j <first.length();++j)
		{
			if(first.charAt(j)==c)
			{
				count1++;
			}
			
		}
		for(int e =0;e<second.length();++e)
		{
			if(second.charAt(e)==c)
			{
				count2++;
			}
			
		}
		res  +=(int) Math.pow(count1-count2, 2);
	 
		}
		
		
		return res;
	}
}
