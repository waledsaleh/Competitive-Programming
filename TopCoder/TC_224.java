package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TC_224 {

	public static void main(String[] args) throws IOException {
		//Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	//BigInteger n,k,m;

	System.out.println(unscramble("SPRKNSUJ SIDCISMPD"));
	
	}
	public static String unscramble(String line)
	{
		int len = line.length()/2;
		if(line.length()==2)return line;
		
		String first = line.substring(0,len);
		boolean check = false;
		char space=' ';
		if(first.charAt(first.length()-1)==' ')
		{
   			space= ' ';
		 check =true;
		}
		String[] split1=first.split(" ");
		
		StringBuilder sb1;
		String result1="";
		for(int i = 0 ; i <split1.length;++i)
		{
			sb1= new StringBuilder(split1[i]).reverse();
			result1 =sb1+" "+result1;
		//sb1.append(" ");
		
		}
		
		StringBuilder q = new StringBuilder(result1);
		//if(!result1.equals(""))
		result1 = q.deleteCharAt(q.length()-1).toString();
		
		//Repeated Above code, we can do method instead of that
		
		String second = line.substring(len,line.length());
		String[] split2=second.split(" ");
		
		StringBuilder sb2;
		String result2="";
		for(int i = 0 ; i <split2.length;++i)
		{
			sb2= new StringBuilder(split2[i]).reverse();
			result2 =sb2+" "+result2;
		//sb1.append(" ");
		
		}
		q= new StringBuilder(result2);
		//if(!result2.equals(""))
		result2 = q.deleteCharAt(q.length()-1).toString();
		
		if(check)return space+""+result1+""+result2;
		
		return result1+""+result2;
		
	}
	
}
