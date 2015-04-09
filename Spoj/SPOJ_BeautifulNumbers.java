package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class SPOJ_BeautifulNumbers {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
	
			while(sc.hasNext())
			{
				int n =sc.nextInt();
		F(n,"");
	   System.out.println();
			}
	
	}
	public static  void F (int n , String s)
	{
	if(n == 0)
	{
		System.out.println(s);
	       return;
	}       
	
		   F(n-1,s + '1');
		   F(n-1, s + '2');
		   F(n-1, s + '3');

	}
}
