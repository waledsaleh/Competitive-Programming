package Main;

import java.io.IOException;

public class TC_620_500 {

	
	public static void main(String[] args) throws IOException {

		System.out.println(able(47,58,384,221));
		
		
	}
	
	static 	String able(int a, int b, int c, int d)
	{
		while(c>0&&d>0)
		{
			if(c==a&&d==b)return "Able to generate";
		if(c>d)c-=d;
			else
				d -=c;
		
		
			
		}
		return "Not able to generate";
	}
}
