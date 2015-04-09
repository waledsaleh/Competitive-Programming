package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class TC_200 {

	public static void main (String [] args) throws IOException {
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
           Scanner sc  = new Scanner(System.in);

                System.out.println(evaluate("1*2*3*4*5*6*7*8*9"));


	}
	
	public static int evaluate(String expr)
	{ 
		// Another Solution
	/*	Stack<Integer>first = new Stack<Integer>();
		Stack<Character>sec = new Stack<Character>();
		char c=' ';
		int n1=3,n2=0;
		//String[] split =expr.split("[\\+\\-\\*\\/]");
		int i =0;
		int count =0;
		for(; i < expr.length();++i)
		{
			if(expr.charAt(i)=='+'||expr.charAt(i)=='/'||expr.charAt(i)=='-'||expr.charAt(i)=='*')
			{
				sec.push(expr.charAt(i));
				
			}
			
			if(!sec.empty()&&first.size()==2)
			{
				n2 = first.pop();
				n1 = first.pop();
				 c = sec.get(count);
				count++;
				
				int res = calc(c,n1,n2);
				first.push(res);
				
			}
		    if(expr.charAt(i)>='0'&& expr.charAt(i)<='9')
			{
				first.push(expr.charAt(i)-'0');
				
			}
			//else
			//	sec.push(expr.charAt(i));
			
		}
		
		
		while(first.size()!=1)
		{
			
			n2 = first.pop();
			n1 = first.pop();
			 c = sec.pop();
			
			int res = calc(c,n1,n2);
			first.push(res);
			
		}
		
		return first.peek();
		*/
		
		int res = expr.charAt(0)-'0';
		for(int i =1 ; i <expr.length();i+=2)
		{
			char c= expr.charAt(i);
			int digit = expr.charAt(i+1)-'0';
			res = calc(c,res,digit);
			
		}
		
		return res;
		
	}
	public static int calc(char c ,int n1 , int n2)
	{
		switch(c)
		{
		case '+':return n1+n2;
		case '-':return n1-n2;
		case '*': return n1*n2;
		case'/':return n1/n2;
		
		}
		return 0;
	}
}
