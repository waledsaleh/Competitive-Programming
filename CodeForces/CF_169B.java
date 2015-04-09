package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

//B - Replacing Digits
public class CF_169B {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	String a =br.readLine();
	
	char[] cha = a.toCharArray();

	String s = br.readLine();
	char[] chs = s.toCharArray();
	
	Arrays.sort(chs);
	
	
	
	boolean t = false;
	
	for(int i = 0 , j=chs.length-1;j>=0&& i <cha.length;)
	{
		
		
		if(cha[i]<chs[j])
		{
			
		cha[i]=chs[j];
					j--;i++;
			
			t=true;
			//if(i==number.length()-1)break;
		}
		else
			i++;
		
		
		
		
	}
	if(t)
for(char j :cha)System.out.print(j+"");
	else
		System.out.println(a);
	
	
	
	}
}
