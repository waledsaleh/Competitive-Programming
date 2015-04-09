package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CF_76{
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	String word = br.readLine();
	int num=0;int count =10;
	String r="";

	String[] s = new String[10];
	for(int i = 0 ; i <s.length;++i)s[i]=br.readLine();
	
	
	int c =0;
	for(int i = 0 ; i <80;i+=10)
	{
	r=word.substring(i, 10+i);
	for(int j = 0 ; j <s.length;++j)
	{
		if(r.equals(s[j]))
		{
			System.out.print(j);
			break;
		}
		
	}
	}
	
	}
}


/* Read problem statement becarefull
 * each 10 characters must equal one from element's of array (S)
 */


