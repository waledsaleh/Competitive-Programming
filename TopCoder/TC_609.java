package Main;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TC_609 {
	
	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	
	
	
	}
	public static  int minimalMoves(String S)
	{
		
		int count =0;
		int len = S.length()/2;
		
		for(int i = 0 ; i <len;++i)
		{
		if(S.charAt(i)=='<')
		count++;
	
		
		}
		for(int i = len; i <S.length();++i)
		{
		if(S.charAt(i)=='>')
		count++;
		
		}
		return count;
	}
	
	}             
