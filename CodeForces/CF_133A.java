package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF_133A {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	String word = br.readLine();
	String res="";boolean f = false;
	for(int i = 0 ; i <word.length();++i)
	{
		if(word.charAt(i)=='H'||
				word.charAt(i)=='Q'||
				word.charAt(i)=='9')
				
		{
               res="YES";f=true;
		}
		else
			continue;
		
	}
if(f)System.out.println(res);
else
	System.out.println("NO");
	
	}
	
	
}
