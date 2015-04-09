package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_10035 {

	public static void main(String[] args) throws IOException {

		StringBuilder sb = new StringBuilder("");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		while(true)
		{
			int count =0;
			int n1 ,n2;
			String[] split = br.readLine().split(" ");
			String first = split[0];
			String sec = split[1];
			if(first.charAt(0)=='0' && sec.charAt(0)=='0')break;
			
			if(first.length()<=sec.length())
			{
				int sum =0;
				for(int i = sec.length()-1,j=first.length()-1 ; i >=0 ;--i,j--)
				{
					n1 = Integer.parseInt(""+sec.charAt(i));
					if(j<0)n2=0;
					else
					n2 = Integer.parseInt(""+first.charAt(j));
					
					sum += n1+n2;
					if(sum>=10)count++;
					sum /=10;
				}
			}
			else
			{
				int sum =0;
				for(int i = sec.length()-1,j=first.length()-1 ; j >=0 ;--i,j--)
				{
					n1 = Integer.parseInt(""+first.charAt(j));
					if(i<0)n2=0;
					else
					n2 = Integer.parseInt(""+sec.charAt(i));
					
					sum += n1+n2;
					if(sum >= 10)count++;
					sum /=10;
				}
			}
			
			if(count==1)
			System.out.print("1 carry operation.\n");
			else	if(count>1)System.out.print(count+" carry operations.\n");//sb.append(count+" carry operations.\n");
			else if(count==0)System.out.print(("No carry operation.\n"));//sb.append("No carry operation.\n");
		}
		//System.out.print(sb);
	}

}
