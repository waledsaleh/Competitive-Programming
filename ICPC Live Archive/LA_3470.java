package Main;

import java.util.Scanner;

public class LA_3470 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int n,d;
		while(true)
		{
			n=sc.nextInt();
			d=sc.nextInt();int saveD=d;
			int[] arr = new int[n+1];
			if(n==0&&d==0)return;
			
			while(d-->0)
				for(int i = 1; i <=n ;++i)arr[i] += sc.nextInt();
			
			boolean res=false;
			for(int i =1 ; i <=n; ++i)
				if(arr[i]==saveD)
					res=true;
			
			if(res)
			System.out.println("yes");
			else
				System.out.println("no");
		}
		
	}

}
