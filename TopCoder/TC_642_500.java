package Main;

import java.util.Scanner;

public class TC_642_500 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
	}
  
	
	static int minFlips(String state)
	{
		char[]ch = state.toCharArray();
		int count =0;
		for(int i = 1 ; i <ch.length;++i)
		{
			if(ch[i-1]=='Y')	
			{
				
				count++;
				for(int j = i-1;i<ch.length;j +=i)
				{
					ch[j]= (ch[j]=='N')?'Y':'N';
				}
			}
		}
		return count;
		
	}
}
