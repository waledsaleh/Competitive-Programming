package Main;

import java.io.IOException;
import java.util.Arrays;
import java.util.Vector;

public class TC_320 {

	
	public static void main(String[] args) throws IOException {

		
		
		System.out.println(average(	

"ab"));
		
	}
	static double average(String s)
	{
		String str = s.charAt(0)+"";
		
		int count =0;
		
		for(int i =1 ; i <s.length();++i)
		{
			if(s.charAt(i)==s.charAt(i-1))
			str +=s.charAt(i);
			else{
				
				count++;
				str =s.charAt(i)+"";
			}
		}
		
	count++;
		
		return (double)s.length()/count;
	}
	
}
