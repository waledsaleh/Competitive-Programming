package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UVA_11479{


	public static void main(String[] args) throws IOException,Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);

	
      int test = sc.nextInt();long a,b,c;
for(int i  =1 ; i <=test;i++)
{
	a=sc.nextLong();b=sc.nextLong();c=sc.nextLong();
	if(a+b>c&&b+c>a&&a+c>b) // check if this triangle or not
	{
	if(a==b&&b==c)
	{
		System.out.println("Case "+i+": "+"Equilateral");
	}
	else if(a==b||b==c||a==c)
	{
		System.out.println("Case "+i+": "+"Isosceles");
	}
	else 
	{
		System.out.println("Case "+i+": "+"Scalene");
	}
	}
	else
		System.out.println("Case "+i+": "+"Invalid");
}

	}
	
}
