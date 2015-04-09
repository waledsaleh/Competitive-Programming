package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class CF_106B {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Vector<String>v  =new Vector<String>();
		int t=Integer.parseInt(br.readLine());
		 while(t-->0)
		 {
			 v.add(br.readLine());
			 
		 }
		 String[] rem=null;
		for(int i = 0 ; i < v.size();++i)
		{
			 if(v.elementAt(i).charAt(0)=='-')continue;
			rem = v.elementAt(i).split(" ");
			int f= Integer.parseInt(rem[0]) , s= Integer.parseInt(rem[1]), third= Integer.parseInt(rem[2]);
			
			for(int j = 0 ; j < v.size();++j)
			{
				if(i==j)continue;
				if(v.elementAt(j).charAt(0)=='-')continue;
			 String[] rem2 = v.elementAt(j).split(" ");	
			 int f2= Integer.parseInt(rem2[0]) , s2= Integer.parseInt(rem2[1]), 
					 third2= Integer.parseInt(rem2[2]);
			
			 
			 if(f2>f&&s2>s&&third2>third)
			 {
				
				 v.removeElementAt(i);
				  v.add(i, "-");
				 i--;
				 break;
			 }
			 
			}
			
		}
		int cost = Integer.MAX_VALUE;
		int index = 0;
		for(int i = 0 ; i < v.size();++i)
		{
			 if(v.elementAt(i).charAt(0)=='-')continue;
			rem = v.elementAt(i).split(" ");
			int f= Integer.parseInt(rem[3]);
				if(f<cost) 
				{
					cost = f;
					index = i+1;
				}
			
		}
		 System.out.println(index);
	}

}
