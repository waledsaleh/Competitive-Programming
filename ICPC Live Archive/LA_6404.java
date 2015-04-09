package Main;

import java.util.Scanner;

public class LA_6404 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();
		while(test-->0)
		{
			String line = sc.next();
			int[] array = new int[1000];
			for(int i = 0 ; i < line.length();++i)
			{
				array[Integer.parseInt(""+line.charAt(i))]++;
			}
			
			
			boolean check = false;
			for(int i = 0 ; i < array.length;++i)
			{
				if(array[i]>=3)
				{
					check = true;break;
				}
			}
			if(check){System.out.println("WEAK");continue;}
			
			for(int i = 0 , j=i+1,k=j+1;i<=3;++i,++k,++j)
			{
				
				if(line.charAt(j)==line.charAt(i)-1&&line.charAt(k)==line.charAt(j)-1||
						
						line.charAt(j)==line.charAt(i)+1&&line.charAt(k)==line.charAt(j)+1)
				{
					check = true;
					break;
				}
				else
					check = false;
			}
			if(check)System.out.println("WEAK");
			else
				System.out.println("ACCEPTABLE");
		}
		
		
	}

}
