package Main;

import java.util.Scanner;

public class LA_6762 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				int test=sc.nextInt();
		while(test-->0)
		{
		
		int n = sc.nextInt();
		int m  = sc.nextInt();
		int[][]arr=new int[n][m];
		for(int i = 0 ; i <n;++i)for(int j = 0 ; j < m ;++j)arr[i][j]=sc.nextInt();
		
		 int sumF=Integer.MIN_VALUE;       
	        for(int i=0;i<n;i++){
	            int []sum=new int[n+m];
	            for(int j=i;j<n;j++){
	                int max=Integer.MIN_VALUE;
	                int tempSum=0;
	                for(int l=0;l<m;l++){
	                    sum[l]+=arr[j][l];
	                    tempSum+=sum[l];
	                    max=Math.max(max, tempSum);
	                    if(tempSum<0)
	                        tempSum=0;
	                }
	                sumF=Math.max(max, sumF);
	            }
	        }
	        System.out.println(sumF);		
		}
		
	}
	
	

}
