package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UVA_1124 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	String word;
	
	while(true)
	{
		word = br.readLine();
		if(word==null)break;
		for(int i = 0 ; i <word.length();++i)
			System.out.print(word.charAt(i));
		
		
		
		System.out.println();
		
	}
	
	}
	
}
