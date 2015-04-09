package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;

public class TC_164 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[]res = justify(new String[]	

{"BOB","TOMMY","JIM"});
		for(String j : res)System.out.print(j+" ");
		    
	}
	static String[] justify(String[] textIn)
	{
		int max = 0;
		for(int i = 0 ;i<textIn.length;++i)max = Math.max(max, textIn[i].length());
		
		String[] res = new String[textIn.length];
		for(int i = 0 ; i <textIn.length;++i)
		{
			int diff = Math.abs(max-textIn[i].length());
			StringBuilder sb = new StringBuilder(textIn[i]);
			while(diff-->0)
			{
				sb.insert(0, " ");
			}
			res[i]=sb.toString();
		}
		return res;
		
	}

}
