package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//6161 	Making Decisions

public class LA_6161{

	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	
	int test = Integer.parseInt(br.readLine());
	while(test-->0)
	{
	String word = br.readLine();
	String d="";
	boolean f = false;
	
	for(int i = 0 ,j=word.length()-1; i <word.length()/2;++i)
	{
		if(word.charAt(i)==word.charAt(j))
		{
			d="Do-it";
			f= true;
		}
		else
			f=false;
		j--;
		
	}
	
	if(f)
	{
		System.out.println(d);
	}
	else
	{
	System.out.println("Do-it-Not");	
	}
	
	}
	
	
	}
	
	
}
