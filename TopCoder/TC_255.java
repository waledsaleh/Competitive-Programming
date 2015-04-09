package Main;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TC_255 {

	public static void main(String[] args) throws IOException {

		
	
		
	}
	
	static String[] rearrange(String[] sequence)
	{
		int[] array = new int [sequence.length];
		for(int i = 0 ; i < array.length;++i)array[i]=Integer.parseInt(sequence[i]);
		
		Arrays.sort(array);
            String[]res = new String[array.length];
  for(int  i = 0 ; i < array.length;++i)res[i]=""+array[i];
		
		return res;
	}
	
	
}
