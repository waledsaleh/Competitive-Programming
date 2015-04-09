package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class LA_2086{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word;
		while((word=br.readLine())!=null)
		{
			if(word.equals("."))break;
			String[] split = word.split(",");
			String last=split[split.length-1];
			last = new StringBuilder(last).deleteCharAt(last.length()-1).toString();
			split[split.length-1]=last;
			for(int i = 0 ; i < split.length;++i)split[i]=split[i].replaceAll(" ", "");
			
			Vector<String>v = new Vector<String>();
			Vector<Integer>v2 = new Vector<Integer>();
						
			for(int i = 0 ; i < split.length;++i)
			{
				if(Character.isLowerCase(split[i].charAt(0))||Character.isUpperCase(split[i].charAt(0)))
				{
					v.add(split[i]);
					//words[count_f]=split[i];count_f++;
				}
				else
				{
					v2.add(Integer.parseInt(split[i]));
				//	numbers[count_s]=Integer.parseInt(split[i]);	count_s++;
				}
				
			
			}
			String[]words=new String[v.size()];
            Integer[]numbers=new Integer[v2.size()];


			for(int i = 0 ; i < v.size();++i)words[i]=v.elementAt(i);
			for(int i = 0 ; i < v2.size();++i)numbers[i]=v2.elementAt(i);
			
			String[]lower=new String[v.size()];
			for(int i = 0 ; i < lower.length;++i)lower[i]=words[i].toLowerCase();
			
			Arrays.sort(numbers);
			bubble(words,lower);
			int count_f=0,count_s=0;
			for(int i = 0 ; i <split.length;++i)
			{
				if(Character.isLowerCase(split[i].charAt(0))||Character.isUpperCase(split[i].charAt(0)))
				{
					if(i==split.length-1)System.out.print(words[count_f]+".");
					else
						System.out.print(words[count_f]+", ");
					count_f++;
				}
				else
				{
					if(i==split.length-1)System.out.print(numbers[count_s]+".");
					else
						System.out.print(numbers[count_s]+", ");
				count_s++;
				}
				
				
			}
			System.out.println();
		}
		
	}
 public static void bubble(String[] upper,String[] lower)
 {
	 for(int i = 0 ; i < lower.length;++i)
	 {
		 for(int j = i+1 ; j < lower.length;++j)
		 {
			 if(lower[i].compareTo(lower[j])>0){
			 String temp = lower[i];
			 lower[i]=lower[j];
			 lower[j]=temp;
			 
			 String temp2 =upper[i];
					 upper[i]=upper[j];
					 upper[j]=temp2;
			 }
			 
		 }
	 }
	 
 }
}
