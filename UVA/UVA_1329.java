package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class UVA_1329 {
    static int N = 20005;
	static int dis[] , p[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		
		int t= Integer.parseInt(br.readLine());
		dis = new int[N];p=new int[N];
		while(t-->0)
		{
		 int n =Integer.parseInt(br.readLine());
		 
		 for (int i = 1; i <= n; i++)
		 {
		 p[i] = i;
		 dis[i] = 0;
		 }
		
		String line="";
		
		while(! (line=br.readLine()).equals("O") )
		{
			StringTokenizer st = new StringTokenizer(line);
			String e=st.nextToken();
		
			if(e.equals("E"))
			{
				int i = Integer.parseInt(st.nextToken());
			  Find(i);
			System.out.println(dis[i]);
			
			}
			else
			{
				//String e = st.nextToken();
				int i =Integer.parseInt(st.nextToken()),j=Integer.parseInt(st.nextToken());
				p[i]=j;
				dis[i] += Math.abs(i-j)%1000;
						
				
				
			}
			
		}
		
		
		}
		
			
			
			
	}
	static int Find(int x)
	{
		
	if (p[x] == x)return x;
	
	int root = Find(p[x]);
	dis[x] += dis[p[x]];
	
	return p[x] = root;
	
	
	}
	
}
