package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_178 {
	public static void main (String [] args) throws IOException {
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
Scanner sc  = new Scanner(System.in);
	
   
          String a = "1-10000";
           
            System.out.println(calculate(a));      
            
	}
	//Another Solution
	
	/*public static int calculate(String input)
	{
		String first= "";
		char c =' ';
		int index =0;
		for(int i = 0 ; i < input.length();++i)
		{
			if(input.charAt(i)>='0'&&input.charAt(i)<='9')
			first +=input.charAt(i)-'0';
			else
			{
				index = i;
				c= input.charAt(i);
				break;
			}
		}
		remove(first);
		String sec ="";
		for(int i = index+1;i<input.length();++i)
		{
			if(input.charAt(i)>='0'&&input.charAt(i)<='9')
				sec +=input.charAt(i)-'0';
		}
		remove(sec);
		int n1 = Integer.parseInt(first);
		int n2 = Integer.parseInt(sec);
		int res = cal(c,n1,n2);
		return res;
		
	}
	public static int cal(char c,int n1,int n2)
	{
		int sum =0;
		switch(c)
		{
		case '+' : return n1+n2;
		case  '-' : return n1-n2;
		case '*': return n1*n2;
		case '/':return n1/n2;
		
		}
		return 0;
		
	}
	public static void remove(String a)
	{
		  int n =2 ;
          while(n!=0)
          {
          	if(a.charAt(0)!='0')break;
  a=a.replaceFirst("0", "");
          }
          
          
	}*/
	
	//Another  good Solution
	public static int calculate(String input)
	{
		String [] numbers = input.split("[\\+\\-\\*\\/]");
		String op = input.replaceAll("[0123456789]", "");
		//op = ""+input.charAt(0);
		return cal(op,Integer.parseInt(numbers[0]),Integer.parseInt(numbers[1]));
		
		
	}
	
	public static int cal(String c,int n1,int n2)
	{
		
		switch(c)
		{
		case "+" : return n1+n2;
		case  "-" : return n1-n2;
		case "*": return n1*n2;
		case "/":return n1/n2;
		
		}
		return 0;
		
		
	}
}
