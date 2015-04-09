package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CF_393A {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
 // StringBuilder sb = new StringBuilder(br.readLine());
 String word = br.readLine();
 
    char[] ch =word.toCharArray();
  
    char[] ch2 = word.toCharArray();
    
  int count_ch=0;
 
  int count_n=0;
  int count_e=0;
  int count_i=0;
  int count_t=0;
  
  int count=0;
  String ni ="nineteen";
  
  StringBuilder sb = new StringBuilder(word);
  
    
    	 for(int j = 0 ; j <word.length();++j)
    	 {
          
    		 
          
            if(word.charAt(j)=='n'){count_n++;}
            
            else  if(word.charAt(j)=='t'){count_t++;}
            
    		 else if(word.charAt(j)=='e'){count_e++;}
            
    		 else if(word.charAt(j)=='i'){count_i++;}//ch[index]=' ';}
    		 
    		 
    	
    	 }
    	 count=count_i;
    		if (count>count_t)count=count_t;
    		if (count> count_e/3) count=count_e/3;
    		if (count>(count_n-1)/2)count=(count_n-1)/2;
    		//cout<<maxx<<endl;
     
  System.out.println(count);
  

	}
public static int linear (char[]ch,char key)
{
	int index =0;
	for(int i = 0 ; i <ch.length;++i)
	{
		if(ch[i]==key)
		{
			index = i;
			break;
		}
	}
	return index;
}
}
