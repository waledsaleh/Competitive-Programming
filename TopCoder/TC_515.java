package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class TC_515 {

public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		 int[] a ={ 500, 800 };
		 int[] b ={ 50, 80 };
				 int[]c={ 5, 8 };
				 
				 System.out.println(getFortunate(a,b,c));
		 
		 
		 
}
public static int getFortunate(int[] a, int[] b, int[] c)
{
	int count =0;
	
	Set<Integer> set = new HashSet<Integer>();
	
	for(int i = 0 ; i <a.length;++i)
	{
		for(int j = 0 ; j <b.length;++j)
		{
			for(int k = 0 ; k <c.length;++k)
			{
				set.add(a[i]+b[j]+c[k]);
			}
		}
	}
	Vector<Integer> v = new Vector<Integer>(set);
	
	String numbers="";
	boolean f = false;
	for(int i = 0 ; i <v.size();++i)
	{
		numbers =String.valueOf(v.get(i));
		for(int j = 0 ; j <numbers.length();++j)
		{
			if(numbers.charAt(j)=='5'||numbers.charAt(j)=='8')
			{
				f=true;
			}
			else
			{
				f=false;
				break;
			}
		}
		if(f)count++;
	}
	
	return count;
}


}
