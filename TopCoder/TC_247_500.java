package Main;

import java.io.IOException;
import java.util.Vector;

public class TC_247_500 {
	public static void main(String[] args) throws IOException {

		System.out.println(position(1,3));
		
		
	}
	
	
 static int position(int numerator, int denominator)
 {
	int pos =0;
	 
	for(int i = 2 ; i <1001;++i)
	{
		for(int j = 1 ; j <i ;++j)
		{
			if(GCD(j,i)==1)pos++;
			if(i==denominator&&j==numerator)return pos;
			
		}
	}
	return pos;
 }
 public static int GCD(int a,int b)
 {
	 if(a==0||b==0)return a+b;
	 return GCD(b,a%b);
	 
 }
 
}
