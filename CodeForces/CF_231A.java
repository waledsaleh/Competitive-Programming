package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF_231A {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int test =sc.nextInt();
	int p=0,v=0,t=0;int count =0;
	while(test-->0)
	{
		
		p=sc.nextInt();
	v=sc.nextInt();
	t=sc.nextInt();
		if(p==1&&v==1&&t==1)
		{
			count++;
		}
		else if(p==1&&v==0&&t==1)
		{
			count++;
		}
		else if(p==1&&v==1&&t==0)
		{
			count++;
		}
		else if(p==0&&v==1&&t==1)
		{
			count++;
		}
		
		
		
	}
	System.out.println(count);
	
	
	}

}
