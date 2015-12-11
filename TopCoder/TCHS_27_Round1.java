package Main;

import java.util.*;

public class TCHS_27_Round1 {

	public static void main(String[] args) {

		
		String[] res = createPattern(	

"P=NP?");
		for(String j : res)System.out.println(j);
		
		
	}
static String[] createPattern(String message)
{
	List<String>list = new ArrayList<String>();
	list.add("x.......x");
	
	for(char ch : message.toCharArray())
	{
		String res =Integer.toBinaryString((int)(ch)).replace("1", "x").replace("0", ".");
		if(res.length()<7)res ="."+res;
		list.add("x"+res+"x");
	}
	
	list.add("x.......x");
	return list.toArray(new String[0]);
	
	
	
}



}
