package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//673 - Parentheses Balance

public class UVA_673 {

	public static void main(String[] args) throws IOException {

	
		 InputStreamReader isr=new InputStreamReader(System.in);
	       BufferedReader br=new BufferedReader(isr);
	       int cases= Integer.parseInt(br.readLine());
	       StringBuilder out = new StringBuilder("");
	       int test = Integer.parseInt(br.readLine());
			while(test-->0)
			{
				String word = br.readLine();
					if(word.equals(""))
					{
						System.out.println("Yes");
					continue;	
					}
					if(word.charAt(0)==']' ||word.charAt(0)==')'){
			               System.out.println("No");
			               continue;
			           }
				Stack<Character>s = new Stack<Character>();
				boolean f = false;
				int count_left=0,count_righ=0;
				for(int i = 0 ; i <word.length();++i)
				{
				
					if(word.charAt(i)=='('||word.charAt(i)=='[')
					{
						s.push(word.charAt(i));
					}
					else if(word.charAt(i)==')'&&!s.empty()&&s.peek()=='(')
					s.pop();
					else if(word.charAt(i)==']'&&!s.empty()&&s.peek()=='[')
						s.pop();
					else
						f=true;
				}
				
				if(s.empty()&&f==false)
				{
					System.out.println("Yes");
					
				}
				else
				{
					
					System.out.println("No");
					
				}
			}
			
		
		
		
	}
		
}
