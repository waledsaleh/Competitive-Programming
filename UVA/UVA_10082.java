package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//10082 - WERTYU uva

public class UVA_10082 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	String word;
	while(sc.hasNext())
	{
		String txt="";int index=0;
		word=sc.nextLine();
		char[] arr = {'`','1','2','3','4','5','6','7','8','9','0','-','=',
	            'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', '[', ']','\\',
	            'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', ';','\'',
	            'Z', 'X', 'C', 'V', 'B', 'N', 'M', ',', '.', '/'};
		
		for(int i = 0 ; i <word.length();i++)
		{
		
			if(word.charAt(i)==' ')
			{
				txt+=" ";
			}
			else if(word.charAt(i)=='\n')
			{
				txt+="\n";
			}
			else{
				 index=search(arr,word.charAt(i));
		
			txt+=arr[index-1];
			}
		}
		
		System.out.println(txt);
		
		
	}
	
	}
	
public static int search(char[]array,char t)
{
	
	for(int i = 0 ; i<array.length;i++)
	{
		if(array[i]==t)
		{
			return i;
		}
	}
	return -1;
}
}
