package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_11461 {

public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		 int a , b;
		 while(true)
		 {
			 int count=0;
			 a=sc.nextInt();
			 b=sc.nextInt();
			 if(a==0&&b==0)break;
			 for(int  i =a ; i <=b;++i)
			 {
				 double result =Math.sqrt(i); 
				 if(result==(int)(result))
				 {
					 count++;
				 }
				 
			 }
			 
			 System.out.println(count);
			 
		 }
}

 
}
