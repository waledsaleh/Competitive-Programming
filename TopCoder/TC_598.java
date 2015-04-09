package Main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Vector;

public class TC_598 {

	public static void main(String[] args) {

		System.out.println(simulate(	

				"eel"));

	}
	static String simulate(String s)
	{
		
	StringBuilder sb = new StringBuilder(s);
		for(int i=0 ;i < sb.length();++i)
		{
			for(int j=1; j < sb.length();++j)
			{
				if(sb.charAt(j)==sb.charAt(j-1))
				{
					sb.deleteCharAt(j);
					sb.deleteCharAt(j-1);
					
					j -=2;
					if(j<0)
					{
						j=1;
					}
				}
			}
			
		}
		
		return sb.toString();
		
	}
}
