package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class Infex_Postfix {
	
	   public static void main(String[] args) 
	   throws IOException {
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Scanner sc = new Scanner(System.in);
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			 
		   int test =Integer.parseInt(br.readLine());
		   InToPost theTrans ;//= new InToPost(input);
		   while(test-->0)
		   {
	      String input =br.readLine();
	      theTrans = new InToPost(input);// "1+2*4/5-7+3/6";
	      String output="";
	     
	      output = theTrans.doTrans(); 
	     bw.write(output+"\n");
	      
		   }
		   bw.flush();
	   }
	
	
}
 class InToPost {
	   private Stack<Character> theStack;
	   private String input;
	   private String output = "";
	   public InToPost(String in) {
	      input = in;
	      int stackSize = input.length();
	      theStack = new Stack<Character>();
	   }
	   public String doTrans() {
	      for (int j = 0; j < input.length(); j++) {
	         char ch = input.charAt(j);
	         switch (ch) {
	            case '+': 
	            case '-':
	            gotOper(ch, 1); 
	            break; 
	            case '*': 
	            case '/':
	            gotOper(ch, 2); 
	            break; 
	            case '(': 
	            theStack.push(ch);
	            break;
	            case ')': 
	            gotParen(ch); 
	            break;
	            default: 
	            output = output + ch; 
	            break;
	         }
	      }
	      while (!theStack.isEmpty()) {
	         output = output + theStack.pop();
	      }
	     // System.out.println(output);
	      return output; 
	   }
	   public void gotOper(char opThis, int prec1) {
	      while (!theStack.isEmpty()) {
	         char opTop = theStack.pop();
	         if (opTop == '(') {
	            theStack.push(opTop);
	            break;
	         }
	         else {
	            int prec2;
	            if (opTop == '+' || opTop == '-')
	            prec2 = 1;
	            else
	            prec2 = 2;
	            if (prec2 < prec1) { 
	               theStack.push(opTop);
	               break;
	            }
			    else
	            output = output + opTop;
	         }
	      }
	      theStack.push(opThis);
	   }
	   public void gotParen(char ch){ 
	      while (!theStack.isEmpty()) {
	         char chx = theStack.pop();
	         if (chx == '(') 
	         break; 
	         else
	         output = output + chx; 
	      }
	   }
}