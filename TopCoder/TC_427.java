package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TC_427 { 

	public static void main (String [] args) throws IOException {
		
		  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                             

              Scanner sc = new Scanner(System.in);

             String[] boys ={"THOMAS","MICHAEL","INDY","LIU"};
             System.out.println(findBoy("JANE",boys));
               
                      
              
	}
	public static String findBoy(String girl, String[] boys)
	{
		 int L = 0 , O = 0 , V = 0 , E =0;
		 
		// if(boys.length==1)return boys[0];
		// List<Integer>list = new ArrayList<Integer>();
		 int[] array = new int[boys.length];
		 
		 for(int i = 0 ; i <girl.length();++i)
		 {
			 if(girl.charAt(i)=='L')L++;
			 else if(girl.charAt(i)=='O')O++;
			 else if(girl.charAt(i)=='V')V++;
			 else if(girl.charAt(i)=='E')E++;
			 
		 }
		 int l = L , o = O , v = V , e =E;
		// list.add(((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E))%100);
		 int count =0;
		for(int i = 0 ; i <boys.length;++i)
		{
			for(int j = 0 ; j < boys[i].length();++j)
			{
				 if(boys[i].charAt(j)=='L')L++;
				 else if(boys[i].charAt(j)=='O')O++;
				 else if(boys[i].charAt(j)=='V')V++;
				 else if(boys[i].charAt(j)=='E')E++;
				
			}
			array[count]=(((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E))%100);
			count++;
			 L = l ; O = o ; V = v ; E =e;
		}
		
		bubble(array,boys);
		List<String>string = new ArrayList<String>();
		
		int max = 0;
		for(int i = 0 ; i <array.length;++i)max=Math.max(max, array[i]);
		
		boolean f = false;
		
		for(int i = 1 ; i <array.length;++i)
		{
			if(array[i]==array[i-1]&&array[i]>=max)
			{
				f=true;
			    string.add(boys[i]);
			    string.add(boys[i-1]);
			}
			
		}
		if(f)
		{
			Collections.sort(string);
			return string.get(0);
			
		}
		 return boys[array.length-1];
             // System.out.println(((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E))%100);
	
		
	}
	public static void bubble(int[]array,String[] boys)
	{
		for(int i =  0 ; i <array.length;++i)
		{
			for(int j = i+1 ; j <array.length;++j)
			{
				if(array[i]>array[j])
				{
					int temp = array[i];//list.get(i);
					array[i]=array[j];
							array[j]=temp;
					
							String Temp = boys[i];
							boys[i]=boys[j];
									boys[j]=Temp;
							
				}
				
			}
		}
		
		
	}
}
