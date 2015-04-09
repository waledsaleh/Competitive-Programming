package Main;

import java.io.IOException;

public class TC_341_500 {
	
	public static void main(String[] args) throws IOException {

		
		
		System.out.println(getKDigits(10,3));
		
		
	}
	static String getKDigits(int N, int K)
	{
		String res = "";
		long f = 1;
		for(int  i = 2 ; i <=N;++i)f *=i;
		
		String num = new StringBuilder(String.valueOf(f)).reverse().toString();
		
		while(true)
		{
			if(num.charAt(0)>'0')break;
			num = num.replaceFirst("0", "");
			
		}
		
		num = new StringBuilder(num).reverse().toString();
		int count =0;
		long Number = Long.parseLong(num);
		while(Number !=0 )
		{
			if(count==K)break;
			long rem = Number%10;
			res +=rem;
			Number /=10;
			count++;
		}
		
		return new StringBuilder(res).reverse().toString();
	}
}
