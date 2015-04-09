package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class UVA_10452 {
	 static String word = "IEHOVA#";
	 static LinkedList<String> path;
	public static void main(String[] args)throws IOException {
     
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		while(test-->0)
		{
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][]array  = new char[n][m];
		for(int i = 0 ; i < n ;++i){
			String e = sc.next();
			for(int j=0;j<e.length();++j){
				array[i][j]=e.charAt(j);
				
				}
			
		}
		int search=0;
		int i =n-1;
		while(array[i][search]!='@')
		{
			++search;
		}
		path= new LinkedList<String>();
		solve(array,i,search,0);
		
		}
		
		
	}
	public static void solve(char[][]array,int i , int j,int counter)
	{
		if(counter == 7){
            for (int k = 0; k < path.size(); k++) {
                System.out.print(path.get(k));
                if(k <path.size()-1)
                    System.out.print(" ");
            }
            System.out.println();
        }
		
		else
		{
            if(i > 0 && array[i-1][j] == word.charAt(counter)){
                path.add("forth");
                solve(array, i-1, j, counter+1);
            }else if(j > 0 && i < array.length && array[i][j-1] == word.charAt(counter)){
                path.add("left");
                solve(array, i, j-1, counter+1);
            }else if(i < array.length && j < array[i].length -1 && array[i][j+1] == word.charAt(counter)){
                path.add("right");
                solve(array, i, j+1, counter+1);
            }
        }
    }
		
	
	
}

