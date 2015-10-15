package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LA_5880 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String k,p;
		while(!(k=br.readLine()).equals("0"))
		{
			StringBuilder sb = new StringBuilder("");
			p=br.readLine();
			
			for(int i = 0,j=0; i < p.length(); ++i)
			{
				
				if(j==k.length())j=0;
				int f = (k.charAt(j)-'A'+1)+(p.charAt(i)-'A'+1);
				if(f>26) sb.append((char)(f-27+'A'));
				else
				{
					f= (k.charAt(j)-'A'+1);
					f +=(p.charAt(i)-'A'+1);
					sb.append((char)(f+'A'-1));
				
				}
				j++;
			}
			System.out.println(sb);
			
			
		}
		
		
	}
	 
	 
	 
}
