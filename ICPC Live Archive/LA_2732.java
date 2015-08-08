package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class LA_2732 {

	public static void main(String[] args)throws IOException {

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String lines ="";
	    ArrayList<String>arr = new ArrayList<String>();
	    int count =0;
		while(!(lines=br.readLine()).equals("#")){arr.add(lines);++count;}
	
		for(int i = 0; i <count+(count+1);++i)System.out.print("-");
		System.out.println();
		
	     char[][] ch = new char[37][count];
	     int i = 0;

			for( ; i <count;++i)
			{  
				lines = arr.get(i);
			    int len =36;
				String word = lines;
				len  = Math.min(len, word.length());
				for(int j = 0; j < len;++j)ch[j][i]=word.charAt(j);
					
			}
			
			for( i = 0 ; i <36;++i)
			{
				for(int j = 0; j <count;++j){
					if(ch[i][j]=='\u0000')System.out.print("|"+" ");
					else
					System.out.print("|"+ch[i][j]);
				}
				System.out.println("|");
			}
			
			for( i = 0; i <count+(count+1);++i)System.out.print("-");
			System.out.println();
	  
	}

}


