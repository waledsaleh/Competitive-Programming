package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TC_203 {
	public static void main (String [] args) throws IOException {
		
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             

      Scanner sc = new Scanner(System.in);
       PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
 
       String[] existingNames ={"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"};
       
       System.out.println(newMember(existingNames,"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
       
}
	public static String newMember(String[] existingNames, String newName)
	{
		int count =1;
		String res ="";
		Map<Integer,String>map = new HashMap<Integer,String>();
		
		for(int i = 0 ; i <existingNames.length;++i)map.put(i, existingNames[i]);
		
		boolean f= false;
		int minus = -2;
		for(int i = 0 ; i <2;++i)
		{
			
			//String search = map.get(newName);
			if(!map.containsValue(newName))
			{
				res = newName;
			}
			else
			{
				newName = newName+""+count;
				
				if(count>1)
				{
					newName = newName.replaceAll("[0123456789]", "");
					newName = newName+""+count;
				}
				count++;
			}
			
		}
		
		
		
		
		return res;
	}
	
}
