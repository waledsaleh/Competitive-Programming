package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LA_2731 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
/*
    % represents 0
    ) represents 1
    ~ represents 2
    @ represents 3
    ? represents 4
    \ represents 5
    $ represents -1 (yes, they even have a negative digit)
*/
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while(!(line =br.readLine()).equals("#"))
		{
			int count =0;
			long res =0;
			for(int i = line.length()-1 ; i >=0;--i)
			{
				if(line.charAt(i)=='%')
				{
					res +=0*Math.pow(6, count);
				}
				if(line.charAt(i)==')')
				{
					res +=1*Math.pow(6, count);
				}
				if(line.charAt(i)=='~')
				{
					res +=2*Math.pow(6, count);
				}
				if(line.charAt(i)=='@')
				{
					res +=3*Math.pow(6, count);
				}
				if(line.charAt(i)=='?')
				{
					res +=4*Math.pow(6, count);
				}
				if((int)line.charAt(i)==92)
				{
					res +=5*Math.pow(6, count);
				}
				if(line.charAt(i)=='$')
					{
						res +=-1*Math.pow(6, count);
					}
				++count;
				
			}
			
			System.out.println(res);
		}
	
	}

}
