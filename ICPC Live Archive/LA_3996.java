package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

public class LA_3996 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int test = Integer.parseInt(br.readLine());
	
	int n;
	while(test-->0)
	{
		int count_0=0,count_4=0,
				count_5=0,
				count_6=0,
				count_7=0,
				count_8=0,
				count_9=0,count_2=0,count_1=0,count_3=0;
				
	String	e=br.readLine();
	
		n=Integer.parseInt(e);
		List<Character>ll = new ArrayList<Character>();
		
	
	e="";
	
		for(int i = 1 ; i <=n;++i)
		{
			
			e=String.valueOf(i);
			for(int j =0 ; j <e.length();++j)
			{
			ll.add(e.charAt(j));
			
			
			}
			e="";
		}
		Collections.sort(ll);
		
		for(int i = 0 ; i<ll.size();++i)
		{
			switch(ll.get(i))
			{
			
			case '0':count_0++;break;
			case '1':count_1++;break;
			case '2':count_2++;break;
			case '3':count_3++;break;
			case '4':count_4++;break;
			case '5':count_5++;break;
			case '6' :count_6++;break;
			case '7':count_7++;break;
			case '8' :count_8++;break;
			case '9' :count_9++;break;
			
			
			}
			
		}
		System.out.println(count_0+" "+count_1+" "+count_2+" "+count_3+" "+count_4+" "+count_5+" "+count_6+" "+count_7+" "+count_8+" "+count_9);
		
	}
		 
		 
		 
		 
		}
		

	
	
	
	}
