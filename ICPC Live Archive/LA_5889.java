package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LA_5889 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int test=Integer.parseInt(br.readLine());
	while(test-->0)
	{
	String word = br.readLine();
	int count_g=0,count_b=0;
	
	for(int i = 0 ; i <word.length();++i)
	{
		if(word.charAt(i)=='g'||word.charAt(i)=='G')
		count_g++;
		else if(word.charAt(i)=='b'||word.charAt(i)=='B')
		count_b++;
	}
	if(count_g>count_b)
	System.out.println(word+" is "+"GOOD");
	else if(count_g<count_b)
		System.out.println(word+" is "+"A "+"BADDY");
	else
		System.out.println(word+" is "+"NEUTRAL");
	
	}
	
	}
	
	
}
