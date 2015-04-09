package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

public class UVA_11991 {
	
    static ArrayList<Vector<Integer>> v2 = new ArrayList<Vector<Integer>>(1000001);

	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder("");
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
      String first="";
       
      while((first=br.readLine())!=null)
      {
    	  StringTokenizer st = new StringTokenizer(first);
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		   for(int i = 0 ; i <1000001 ;++i)
			  {
	    	   v2.get(i).clear();
			  }
		 st = new StringTokenizer(br.readLine());
		 
       for(int i = 0 ; i < n ;++i)
       {
    	int num = Integer.parseInt(st.nextToken());
    	
    	 v2.get(num).add(i);
    	 
       }
       while(m-->0)
       {
    	   st = new StringTokenizer(br.readLine());
    	   int s = Integer.parseInt(st.nextToken()),f=Integer.parseInt(st.nextToken());
    	   if(v2.get(f).size()>=s)
    	  sb.append(v2.get(f).get(s-1)+1).append("\n");
    	   else
    		   sb.append(0).append("\n");
       }
       
      }
      System.out.print(sb);
      
	}

}


/// Solution

/*
#include <stdio.h>
#include <vector>

using namespace std;

vector<int> arr[1000001];
int main()
{

    int x,y,z,num,occ;
    while(scanf("%d %d",&x,&y)==2){
        for ( int i = 0; i < 1000001; i++ ) {
            arr[i].clear ();
        }
        for(int i=0;i<x;i++){
            scanf("%d",&z);
            arr[z].push_back (i + 1);
        }
        for(int i=0;i<y;i++){
            scanf ("%d %d", &occ, &num);
             if ( arr[num].size()< occ ) {
                printf("0\n");
             }
            else{
                printf("%d\n",arr [num] [occ - 1]);
            }
        }
    }
}

*/