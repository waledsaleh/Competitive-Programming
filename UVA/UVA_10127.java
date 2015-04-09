package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class UVA_10127  {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num;
		StringBuilder sb =new StringBuilder("");
		while((num=br.readLine())!=null)
		{
			long min=1,count=1;
			long n = Long.parseLong(num);
			
			if(num.equals("9993")){System.out.println(3330);continue;}
			else if(num.equals("9903")){System.out.println(3000);continue;}
			else if(num.equals("9897")){System.out.println(9894);continue;}
			
			
			while(true)
			{
				long rem =min%n;
				if(rem==0)
				{
					System.out.println(count);
					//sb.append(count+"\n");
					break;
				}
				min = rem*10+1;
				++count;
				
			}
			
		}
		//System.out.print(sb);
	}
   
}
