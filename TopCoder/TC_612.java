package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class TC_612 {

public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 
		 
		 
}

public static int count(String S)
{
	
	if(S.length()==1)return 0;
	
	int count =0;
	
	for(int i = 1 ; i <S.length();++i)
	{
		if(S.charAt(i)=='L'&&S.charAt(i-1)=='R')
		count++;
	}
	
	return count;
}

}
