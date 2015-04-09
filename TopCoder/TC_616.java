package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC_616 {
	public static void main (String [] args) throws IOException {
		
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             
Scanner sc  = new Scanner(System.in);

int[] v = {10000};
System.out.println(countAlarms(v,10000));
 

	}
	public static int countAlarms(int[] volume, int S)
	{
		int Count =0;
		while(true)
		{
			if(S<=0)break;
			for(int i = 0 ; i < volume.length;++i)
			{
				Count++;
				S -=volume[i];
				if(S<=0)break;
				
				
			}
			
		}
		
		return Count;
	}
}
