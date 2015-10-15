package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class CF_81A {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		
		Stack<Character>st = new Stack<Character>();
		StringBuilder sb = new StringBuilder("");
		for(int i = 0; i < word.length();++i)
		{
			if(st.size()>0 && st.peek()==word.charAt(i))st.pop();
			else
				st.push(word.charAt(i));
			
		}
		for(int i = 0; i < st.size();++i)sb.append(st.get(i));
		
		System.out.println(sb);
		
	}

}
