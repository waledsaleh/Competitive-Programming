package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_11559 {


	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
	   
		BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true){
			
			String line = buff.readLine();
			if(line==null)break;
			st=new StringTokenizer(line);
			
		int N=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		int H=Integer.parseInt(st.nextToken());
		int W=Integer.parseInt(st.nextToken());
		int min = Integer.MAX_VALUE;
		//int [] a=new int[H];
	//	int c=0;
		for(int i=0;i<H;i++){
			int pricePerPerson=Integer.parseInt(buff.readLine());
			st=new StringTokenizer(buff.readLine());
			for(int j=0;j<W;j++){
				int beds=Integer.parseInt(st.nextToken());
				if(beds >= N){
					//a[c++]=pricePerPerson*N;
					min = Math.min(pricePerPerson*N, min);
					break;
				}
			}
		}
		if(min!=Integer.MAX_VALUE){
	//	Arrays.sort(a);
		if(min<=B)
		System.out.println(min);
		else
			System.out.println("stay home");
		}
		else{
			System.out.println("stay home");
		}
 
		}
 
		
	}
 
}
