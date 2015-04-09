package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_787 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String seq;
		
		while((seq=br.readLine())!=null)
		{
			StringTokenizer st = new StringTokenizer(seq);
			long[] array = new long[st.countTokens()-1];
			int count =0;
			while(true)
			{
				long num = Long.parseLong(st.nextToken());
				if(num==-999999)break;
				array[count++]=num;
				
			}
			BigInteger prod =BigInteger.ONE;
			
			BigInteger max =new BigInteger("-999999");
			for(int i = 0 ; i <array.length;++i)
			{
				 prod =BigInteger.ONE;
				for(int j = i ; j <array.length;++j)
				{
					prod = prod.multiply(BigInteger.valueOf(array[j]));
					if(prod.compareTo(max)>0)max = prod;
				}
				
				
			}
			System.out.println(max);
			
		}
		
		
		
	}
	
	

}
