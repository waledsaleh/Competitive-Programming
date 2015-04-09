package Main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class CF_118B {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
  Vector<String>v = new Vector<String>();
  String res="";
	int m =1;
	int k = n+n;
	for(;k>=0;){
		for(int e =k;e>0;--e){
		System.out.print(" ");
		res +=" ";
		}
		break;
	}
	res +="0";
			v.add(res);
	System.out.println(0);
	res ="";
	for(;m<=n;++m)
	{
		res ="";
		k -=2;
		for(;k>=0;){
			for(int e =k;e>0;--e){
			System.out.print(" ");
			res +=" ";
			}
			break;
		}
		res +="0 ";
		
		System.out.print(0+" ");
		
		int i=0;
		for( i = 1;i<=m;++i)
		{
			if(i==1){System.out.print(i); res +=i;}
			else{
			System.out.print(" "+i);
			res +=" "+i;
			
			}
		}
		System.out.print(" ");
		res +=" ";
		for(int j = i-2;j>=0;--j)
		{
			if(j==i-2){System.out.print(j);res +=j;}
			else{
			System.out.print(" "+j);
			res +=" "+j;
			}
			//res +=j+" ";
		}
		v.add(res);
		System.out.println();
		
	}
	for(int i = v.size()-2;i>=0;--i)System.out.println(v.elementAt(i));
        
		  
	}
}
