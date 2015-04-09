package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CF_339A {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	String number = br.readLine();
	String e  = "";
	
	int[] array = new int[number.length()];
//	for(int i  = 0 ; i <array.length;i++)array[i]=0;
	ArrayList<Integer>ll = new ArrayList<Integer>();
	
	for(int i = 0 ; i <number.length();++i)
	{
		e="";
		if(number.charAt(i)>='1')
		{
			e=number.charAt(i)+"";
			
			ll.add(Integer.parseInt(e));
		}
	}
	Collections.sort(ll);;
	System.out.print(ll.get(0));
	
	for(int j =1;j<ll.size();++j)System.out.print("+"+ll.get(j));
	
	System.out.println();
	
	}
	
	
}
