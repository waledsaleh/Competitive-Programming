package Main;

import java.util.Scanner;

public class CF_320A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		boolean f= false;
		for(int  i = 0 ; i < num.length();++i)
		{
			if(num.charAt(i)=='1')f=true;
			else if(num.charAt(i)=='4')f=true;
			else{
				f=false;break;
			}
		}
		
		if(f)
		{
			if(num.contains("444")||num.charAt(0)!='1')
			System.out.println("NO");
			else
				System.out.println("YES");
			
			
			
		}
		else
			System.out.println("NO");
	}

}
