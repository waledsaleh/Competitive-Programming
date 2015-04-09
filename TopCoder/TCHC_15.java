package Main;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

public class TCHC_15 {
	public static void main(String[] args) throws IOException {

		System.out.println(getLeast("1 2 3 4",2));
		
	}
	
	static int getLeast(String line, int givenNumber)
	{
		StringTokenizer st = new StringTokenizer(line);
		
		int[] array = new int[st.countTokens()];
		
		for(int i = 0; i <array.length;++i)array[i]=Integer.parseInt(st.nextToken());
		
		Arrays.sort(array);
		for(int i = 0 ; i < array.length;++i)if(array[i]>givenNumber)return array[i];
		
		return -1;
	}

}
