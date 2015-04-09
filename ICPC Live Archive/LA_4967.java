package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class LA_4967 {
    static int[][] grid;
    static long[][]dp=new long[100001][3];
    
    public static void main (String[] args) throws IOException {
    
      Scanner sc = new Scanner(System.in);
    int count =1;
    while(true)
    {
        int R=sc.nextInt();
        if(R==0)break;
		int C=3;
		grid = new int[R][C];
		long min = Long.MAX_VALUE;
		for(int i = 0 ; i <dp.length;++i)for(int j = 0 ; j <3;++j)dp[i][j]=-1;
		
		for(int i = 0 ; i <R ;++i)
		{
		  			for(int j = 0 ; j <C ;++j)grid[i][j]=sc.nextInt();
		}
		for(int i = R-1;i>=0;i--)min(i,0,R,C);
		
		System.out.println(count+". "+min(0,1,R,C));
		
		
       count++;
    }  
    
  }
   public static long min(int r , int c,int R,int C)
 {
	 if(r<0||r>R-1||c<0||c>C-1)return 100000000;
	 
	 if(r==R-1&&c==1)return grid[r][c];
	 
	 if(dp[r][c]!=-1)return dp[r][c];
	 
	 long path1 = min(r,c+1,R,C);
	 long path2=  min(r+1,c,R,C);
	 long path3 = min(r+1,c+1,R,C);
	 long path4 =  min(r+1,c-1,R,C);
			 
	 return dp[r][c]=grid[r][c]+Math.min(path1, Math.min(path2, Math.min(path3, path4)));
	 
 }
   
 }
