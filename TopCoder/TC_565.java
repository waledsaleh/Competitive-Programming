package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class TC_565 {

	public static void main(String[] args) throws IOException {

		String[] e = build(new int[]{2, 3, 5, 5, 5, 2, 0, 8});
		for(String j : e)System.out.println(j);
		
	}
	static String[] build(int[] values)
	{
		int max = 0;
		
		int[] array = new int[10];
		for(int i = 0 ; i < values.length;++i)max = Math.max(max,++array[values[i]]);
		
	String[] b = new String[max+1];
		int count =0;
	
		for(int i = 0 ; i <=max;++i)
		{
				String res ="";
		    for(int j = 0 ; j <10;++j)
		    {
		    	if(array[j]>max-i)
		    	{
		    		res +='X';
		    	}
		    	else
		    		res +='.';
		    }
		    b[count]=res;
						count++;
		}
		
		
		return b;
		
		
	}
	

}
