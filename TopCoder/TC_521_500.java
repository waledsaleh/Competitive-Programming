package Main;

import java.util.Stack;

public class TC_521_500 {

	public static void main(String[] args) {

		System.out.println(countCorrections("())(())((()))))()((())))()())())())()()()"));
		
	}
   static int countCorrections(String par)
   {
	Stack<Character> stack = new Stack<Character>();
	Stack<Character> stack2 = new Stack<Character>();
	for(int i = 0 ; i < par.length();++i)
	{
		if(par.charAt(i)==' ')continue;
		if(par.charAt(i)=='(')stack.push(par.charAt(i));
		if(par.charAt(i)==')')stack2.push(par.charAt(i));
		
	 if(par.charAt(i)==')'&& !stack.isEmpty()&&!stack2.isEmpty() && stack.peek()=='('&&stack2.peek()==')')
		{
			stack.pop();
			stack2.pop();
		}
	}
	
	return  stack.size()+stack2.size() ;
	
   }


}
