package Main;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Vector;

public class UVA_10207 {

 static BigInteger[][]count;
 
	public static void main(String[] args) {
    double[][]dp= new double[1001][1001];		
	  		Rec_Count(1001);
	  		StringBuilder sb=new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int test =0;
		while(true)
		{
	double p = sc.nextDouble();
	      int n = sc.nextInt();
	      double q=1-p;
	      
	      if(n==0)break;
	      
	      if(test>0)sb.append("\n");
	      
	      while(n-->0)
	      {
	    	  int n1=sc.nextInt();
	    	  int n2 =sc.nextInt();
	    	  
	    		  P(p,q,dp);
	    	  String res=String.format("%.5f\n",dp[n1][n2]);
	    	  sb.append(res);
	    	  
	    	  sb.append(count[n1][n2]+"\n");
	    	 
	      }
	      test++;
		}
		System.out.print(sb);
	}
   
	public static void P(double p,double q,double[][]dp)
	{
	
            for(int i=0;i<1001;i++){
                    dp[i][0]=0;
                    dp[0][i]=1;
            }
            dp[0][0]=-1;
            
            for(int i=1;i<1001;i++)
            {
                    for(int j=1;j<1001;j++)
                            dp[i][j]=p*dp[i-1][j]+q*dp[i][j-1];
            }
            
	}
	 static void Rec_Count(int MAX){
         count=new BigInteger[MAX][MAX];
       
         for(int i=0;i<MAX;i++){
                 count[i][0]=BigInteger.ZERO;
                 count[0][i]=BigInteger.ZERO;
         }
         for(int i=1;i<MAX;i++)
                 for(int j=1;j<MAX;j++)
                         count[i][j]=count[i-1][j].add(count[i][j-1]).add(BigInteger.valueOf(2));
 }

}
