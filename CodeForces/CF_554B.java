package Main;

import java.util.Scanner;

public class CF_554B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		String[] a = new String[n];
	
		for(int i =0 ; i <n;++i)a[i]=sc.next();
		
		int max = 0;
		for(int i =0 ; i <n;++i)
		{
			int count=0;
			for(int j  = 0 ; j <n;++j){
				if(a[i].equals(a[j]))count++;
			}
			max = Math.max(max, count);
		}
		System.out.println(max);
		
	}

}
