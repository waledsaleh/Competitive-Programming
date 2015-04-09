package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class CF_38A3 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
 String h = "hello";
	int count =0;
	String word = br.readLine();
	boolean f = false;
	for(int i = 0 ; i <word.length();++i)
	{
		if(word.charAt(i)==h.charAt(count))
		{
			count++;
		
		if(count==h.length())
		{
			System.out.println("YES");break;
		}
		
		}
	}
	if(count!=5)
		System.out.println("NO");
	}
	
	

}
