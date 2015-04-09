package Main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class CF_26B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	  String bracket = sc.next();
		Stack<Character>first = new Stack<Character>();
		Stack<Character>sec = new Stack<Character>();
		int count =0;
		for(int i  = 0 ; i < bracket.length();++i)
		{
			if(bracket.charAt(i)=='(')first.push('(');
			if(bracket.charAt(i)==')'&&!first.isEmpty()&&first.peek()=='(')
			{
				first.pop();
				count +=2;
			}
			
		}
		System.out.println(count);
		
	}
}
