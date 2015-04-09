package Main;

import java.io.IOException;
import java.util.Scanner;


public class UVA_11332 {
	public static void main(String[] args) throws IOException {

	Scanner sc = new Scanner(System.in);
	while(true){
	long n = sc.nextLong();
	long sum=0,rem=0;
	if(n==2&&n==1)System.out.println(n);
     if(n==0)break;
	else
	{
	while(n!=0)
	{
		rem=n%10;
		sum+=rem;
		n/=10;
		
	}
	if(sum==2||sum==1)System.out.println(sum);
	else if(sum<=9&&sum>=1)
		System.out.println(sum);
	long sumag=0;
	if(sum>9)
	{
		long rems=0;sumag=0;
		while(sum!=0)
		{
			rems=sum%10;
			sumag+=rems;
			sum/=10;
		}
		
	
	}
	if(sumag==2||sumag==1)System.out.println(sumag);
	else if(sumag<=9&&sumag>=1)
		System.out.println(sumag);
	if(sumag>9)
	{long remag=0;long sum2=0;
		while(sumag!=0)
		{
			remag=sumag%10;
			sum2+=remag;
			sumag/=10;
		}
		if(sum2==2||sum2==1)System.out.println(sum2);
		else if(sum2<=9&&sum2>=1)
			System.out.println(sum2);
	}
	}
	
	
	}
	}
	
}
