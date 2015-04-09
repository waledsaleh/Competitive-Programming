package Main;

import java.util.Vector;

public class TC_233 {

	public static void main(String[] args) {

		  String[] res = format(new String[]{"BOB","TOMMY","JIM"});
		  for(String e : res)System.out.print(e+" ");
		
	}
	
	public static String[] format(String[] text)
	{
		int max =Integer.MIN_VALUE;
		for(int i = 0 ; i < text.length;++i)max =Math.max(max, text[i].length()); 
		
		Vector<String>v = new Vector<String>();
		for(int i = 0 ; i <text.length;++i)
		{
			int New = max-text[i].length();
			if(New==0)v.add(text[i]);
			else
			{
				StringBuilder sb = new StringBuilder(text[i]);
				for(int j = 0 ; j < New;++j)sb.insert(0, ' ');
				v.add(sb.toString());
				
			}
		}
		
		String[] res = new String[v.size()];
		for(int i = 0 ; i < res.length;++i)res[i]=v.elementAt(i);
		return res;
		
		
		
	}
	
}
