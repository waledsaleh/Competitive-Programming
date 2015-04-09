package Main;

import java.util.Scanner;

public class CF_265A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		char[] line = sc.next().toCharArray();
		if(n==1&&line[0]=='0'){System.out.println(1);return;}
		int count =0;
		int carry=1;
		for(int i = 0 ; i < line.length;++i)
		{
			if(line[i]=='1'&&carry!=0)
			{
				line[i]='0';
				carry = 1;
				count++;
			}
			else if(line[i]=='0')
			{
				if(carry == 1)
				{
					line[i]='1';
					count++;
					carry =0;
				}
				
			}
			
			
		}
		System.out.println(count);
	}

}
