package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TC_283 {


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	String[] s = new String[3];
	for(int i = 0 ; i <s.length;++i)s[i]=br.readLine();
	System.out.println(count(s));
	
	}
	public static int count (String[] s)
	{
		int main=0;
		int cal =0;int countf =0;int counts=s.length-1;
		for(int i = 0 ; i <s.length;++i)
		{
			
			for(int j = 0 ; j <s[i].length();++j)
			{
				int e = Integer.parseInt(s[i].charAt(countf)+"");
				main +=e;
				countf++;
				break;
			}
			
			for(int j = 0 ; j <s[i].length();++j)
			{
				int e = Integer.parseInt(s[i].charAt(counts)+"");
				cal +=e;
				counts--;
				break;
			}
			
			
		}
		
		return main-cal;
		
	}
}
