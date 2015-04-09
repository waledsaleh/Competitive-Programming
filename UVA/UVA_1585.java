package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_1585 {
     
	public static void main(String[] args) throws IOException {

		 Scanner sc = new Scanner(System.in);
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int t = sc.nextInt();
			while(t-->0)
			{
				String l = sc.next();
				int count =1;
				int res =0;
				for(int i =0; i < l.length();++i)
				{
					if(l.charAt(i)=='O')
					{
						res +=count;
						count++;
					}
					else
					{
						count =1;
					}
				}
				System.out.println(res);
			}
	}
	
}
