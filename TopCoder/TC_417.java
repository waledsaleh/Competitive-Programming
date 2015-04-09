package Main;

import java.io.IOException;

public class TC_417 {
	public static void main(String[] args) throws IOException {

		System.out.println(getReversedSum(100,200));
		
	}
	
	static int getReversedSum(int x, int y)
	{
		String n1 = new StringBuilder(String.valueOf(x)).reverse().toString();
		
		String n2 = new StringBuilder(String.valueOf(y)).reverse().toString();
		
		n1 = remove(n1);
		n2 = remove(n2);
		
		String q =new StringBuilder(String.valueOf(Integer.parseInt(n1)+Integer.parseInt(n2))).reverse().toString();
		return Integer.parseInt(q);
		
	}
   public static String remove(String n)
   {
	   String n1=n;
	   while(true)
		{
			if(n1.charAt(0)=='0')
			n1 =n1.replaceFirst("0", "");
			else
				break;
		}
	   return n1;
   }
}
