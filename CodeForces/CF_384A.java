package Main;

import java.util.Scanner;

public class CF_384A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     
		int n = sc.nextInt();
		if(n==1)
		{
			System.out.println(1);
			System.out.println("C");return;
		}
		if(n==2)
		{
			System.out.println(2);
			System.out.println("C.\n.C");return;
		}
		char[][] ch = new char[n][n];
		for(int i = 0 ; i <n;++i)for(int j = 0 ; j <n;++j)ch[i][j]='.';
		
		int count =0;
		for(int  j = 0 ; j <n ;++j)
		{
			for(int i = 0 ; i < n ;)
			{
				if(j%2==0)
				{
					ch[i][j]='C';
					count++;
					i +=2;
				}
				if(j%2!=0)
				{
					if(i==0)i=1;
						
					ch[i][j]='C';
					count++;
					i +=2;
				}
			}
		}
		StringBuilder sb = new StringBuilder("");
		sb.append(count+"\n");
		for(int i = 0 ; i <n;i++)
	    {
	        for(int j = 0 ; j <n;++j)
	        {
	            sb.append(ch[i][j]);
	            
	        }
	        sb.append("\n");
	    }
		System.out.print(sb);
	}

}
