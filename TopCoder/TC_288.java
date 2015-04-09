package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TC_288 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	int startingBalance=Integer.parseInt(br.readLine());
	int n=Integer.parseInt(br.readLine());
	String[] transactions=new String[n];
	
	for(int i = 0 ; i <n;++i){
		
		transactions[i]=br.readLine();
		}
	
	System.out.println(processTransactions(startingBalance, transactions));
	
	
	}
	public static int processTransactions(int startingBalance, String[] transactions)
	{
		int count;
		char c = 'c';
		char d = 'd';
		String[] s ;
		int sum=startingBalance;
		for(int i = 0 ; i <transactions.length;++i)
		{
			count=0;
			s=transactions[i].split(" ");
			if(s[count].charAt(count)=='C')
			{
				sum +=Integer.parseInt(s[count+1]);
			}
			
			else if(s[count].charAt(count)=='D')
			{
				sum -=Integer.parseInt(s[count+1]);
			}
		}
		return sum;
	}
	
}
