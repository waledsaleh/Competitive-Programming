package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CF_122A {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
String number = br.readLine();
boolean f= false;
for(int i = 0 ; i <number.length();++i)
{
	if(number.charAt(i)=='4'||number.charAt(i)=='7')
	{
		f=true;
	}
	else
		{f=false;break;}
}
if(f)
System.out.println("YES");
else
{
	int n = Integer.parseInt(number);
	if(n%4==0||n%7==0||n%47==0)
	System.out.println("YES");
	else
		System.out.println("NO");
}
		
	


	
	
	}
	
	
}
