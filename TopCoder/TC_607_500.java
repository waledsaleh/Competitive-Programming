package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//500

public class TC_607_500 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	String[] s1 = new String[]{"a","a",""};
	String[] s2 = new String[]{"a"};
	//for(int i = 0 ; i <3;++i)s1[i]=br.readLine();
	//for(int i = 0 ; i <3;++i)s2[i]=br.readLine();
	
	System.out.println(count(s1,s2));
	
	}
	public static   int count   (String[] S1,String[] S2)
	{
		String a="";
		String b = "";
		int count =0;
		for(int i = 0 ; i <S1.length;++i)
		{
			a +=S1[i];
			
		}
		for(int i = 0 ; i <S2.length;++i)
		{
			b +=S2[i];
			
		}
		String S = a+b;
		//String e = "";
		for(int i = 0 ; i <S.length();++i)
		{
			for(int j = i+1;j<=S.length();++j)
			{
			if(palin(S.substring(i,j)))
			{
				count++;
				
				
			}
			
			}
			
			
		}
		return count;
	}
	public static boolean palin(String s)
	{
		int low =0;
		int high = s.length()-1;
		for(;low<high;)
		{
			if(s.charAt(low)!=s.charAt(high))
			return false;
			
			
			low++;
			high--;
		}
		
		return true;
	}
}
