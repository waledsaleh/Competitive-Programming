package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
//10921 - Find the Telephone uva
public class UVA_10921 {

	public static void main(String[] args) throws IOException {

		
	Scanner sc = new Scanner(System.in);
	
	StringBuilder sb ;
	while(sc.hasNext())
	{
	String c= sc.next();
	if(c.charAt(0)=='.')break;
	sb=new StringBuilder();
	int abc=2,def=3,ghi=4,jkl=5,mno=6,pqrs=7,tuv=8,wxyz=9,one=1,zero=0;
	char x;
	for(int i = 0 ; i <c.length();i++)
	{
		String s ="";
		x=c.charAt(i);
		if(x=='A'||x=='B'||x=='C')
		{
			sb.append(String.valueOf(abc));
		}
		if(x=='a'||x=='b'||x=='c'||x=='d'||	x=='e'	||x=='f'||x=='g'||x=='h'||x=='i'||x=='j'||x=='k'||x=='l'||x=='m'||x=='n'||x=='o'||x=='p'||x=='q'||x=='r'||x=='s'||x=='t'||x=='u' ||x=='v'||x=='w'||x=='x'||x=='y'||x=='z')
		{
			s=x+"";
			sb.append(s);
		}
		if(x=='-')
		{
			sb.append("-");
		}
		if(x=='D'||x=='E'||x=='F')
		{
			sb.append(String.valueOf(def));
		}
		
		if(x=='J'||x=='K'||x=='L')
		{
			sb.append(String.valueOf(jkl));
		}
		if(x=='G'||x=='H'||x=='I')
		{
			sb.append(String.valueOf(ghi));
		}
		if(x=='M'||x=='N'||x=='O')
		{
			sb.append(String.valueOf(mno));
		}
		if(x=='P'||x=='Q'||x=='R'||x=='S')
		{
			sb.append(String.valueOf(pqrs));
		}
		if(x=='T'||x=='U'||x=='V')
		{
			sb.append(String.valueOf(tuv));
		}
		if(x=='W'||x=='X'||x=='Y'||x=='Z')
		{
			sb.append(String.valueOf(wxyz));
		}
		if(x=='1')
		{
			sb.append(String.valueOf(one));
		}
		if(x=='0')
		{
			sb.append(String.valueOf(zero));
		}
	}
	System.out.println(sb);
	}
	
	}
	
}
