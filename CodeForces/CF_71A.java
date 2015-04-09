package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF_71A {
	
		public static void main(String[] args) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		 
		int test = Integer.parseInt(br.readLine());
		String word ="";char[] ch ;
		while(test-->0)
		{
			word=br.readLine();int count=0;char first =' ',last=' ';
			String result="";
			
			if(word.length()>10)
			{
			ch = word.toCharArray();
			first = ch[0];
			last = ch[ch.length-1];
			
			for(int i = 1 ; i <ch.length-1;++i)
			{
			count++;	
				
				
			}
			
			result = first+""+count+""+last;
			System.out.println(result);
			}
			else
				System.out.println(word);
			
			
		}
		
		
		}

}

