package Main;

import java.util.Scanner;

public class CF_114A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long k= sc.nextInt();
		long l = sc.nextInt();
		int count =0;
		int c=1;
		long res= k;
		if(res==l){System.out.println("YES");System.out.println(0);return;}
		boolean f =false;
		while(true)
		{
			res =(long)Math.pow(k,c);
			if(res==l){f=true;break;}
			 if(res>Integer.MAX_VALUE)break;
		//	count++;
			c++;
		}
		if(f){System.out.println("YES");System.out.println(c-1);}
		else
			System.out.println("NO");
		
		
		
	}

}
