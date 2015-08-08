package Main;

import java.util.Scanner;

public class CF_102B{

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	String num = sc.next();
	if(num.length()==1){System.out.println(0);return;}
		
	int sum =0;
	int count =0;
	for(int i = 0 ; i <num.length();++i)
	{
		sum +=(num.charAt(i)-'0');
		
	}
		while(true)
		{
			 if(String.valueOf(sum).length()==1)break;
		 count++;	
		int tmp = sum;
		int sum2=0,rem=0;
		while(tmp!=0)
		{
			rem =tmp%10;
			sum2+=rem;
			tmp /=10;
			
		}
		 sum =sum2;
		
		}
	
		 System.out.println(count+1);
	}

}
