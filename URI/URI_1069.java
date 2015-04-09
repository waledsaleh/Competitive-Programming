package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class URI_1069 {

	
	public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 
		int test = Integer.parseInt(br.readLine());
		while(test-->0)
		{
			String word = br.readLine();
			Stack<Character> st = new Stack<Character>();
			word = word.replaceAll("[.]", "");
			//System.out.println(word);
			boolean f = false;
			int count =0;
			for(int i = 0 ; i <word.length();++i)
			{
				if(word.charAt(i)=='<')
				st.push(word.charAt(i));
				else if(word.charAt(i)=='>'&&!st.isEmpty()&&st.peek()=='<')
				{
					count++;
				st.pop();
				}
				
				
			}
			if(st.isEmpty())System.out.println(count);
			else
				System.out.println(count);
				
		}
	}
}
