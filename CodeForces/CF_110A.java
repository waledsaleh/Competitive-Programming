package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF_110A {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int count=0;
	
	String n = br.readLine();boolean t = false;
	String e="";
	for(int i = 0 ; i <n.length();++i)
	{
		if(n.charAt(i)=='4'||n.charAt(i)=='7')
		{
		count++;
		}
		if(count==4||count==7)
		{
			t=true;
			e="YES";
		}
		else
			t=false;
	}
	if(t)
	System.out.println(e);
	else
		System.out.println("NO");
	}

}
