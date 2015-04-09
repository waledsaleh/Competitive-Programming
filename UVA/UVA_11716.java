package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVA_11716 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		//BufferedWriter bf = new BufferedWriter(new InputStreamWriter(System.out));
		
	int test = Integer.parseInt(br.readLine());
	String text;
	
	while(test-->0)
	{
		int l=0;
		text=br.readLine(); //br.readLine();
		int len = text.length();
		StringBuilder sb = new StringBuilder("");
		
		l =(int)Math.sqrt(len);
		
		if(l*l==len)
		{
			
			
			String sub ;
			char[][] ch = new char[l][l];
			int c =0;
			for(int i = 0 ; i <text.length();i+=l)
			{
				sub = text.substring(i,i+l);
				for(int j = 0 ; j <sub.length();++j)
				{
					ch[c][j]=sub.charAt(j);
					
				}
				
				c++;
			}
			for(int j = 0 ; j <ch.length;++j)
			{
				for(int i = 0 ; i <ch.length;++i)
				{
					sb.append(ch[i][j]);
					//System.out.print(ch[i][j]);
				}
				
			}
			System.out.println(sb);
		}
		else
		{
			System.out.println("INVALID");
		}
		//System.out.println();
		
	}
	
	}
	
	
	
}
