package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF_282A {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int x=0;
	int test = Integer.parseInt(br.readLine());String word="";
	for(int i = 1 ; i <=test;++i)
	{
		word=br.readLine();
		if(word.charAt(1)=='+')
		{
			x++;
		}
		else if(word.charAt(1)=='-')
		{
			x--;
		}
		else if(word.charAt(0)=='+')
		{
			++x;
		}
		else if(word.charAt(0)=='-')
		{
			--x;
		}
		
		if(i==test)
		{
			System.out.println(x);
		}
	}
	
	}
	

}
