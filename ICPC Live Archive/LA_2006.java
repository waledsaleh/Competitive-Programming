package Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LA_2006 {

	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line;
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		int max=0;
		String last="";
		while(true)
		{
			line = bf.readLine();
			line = line.toLowerCase();
			
			if(line.equals("#"))
			{
				if(max==0)break;
				int space = Math.abs(String.valueOf(max).length()-4);
				for(int i = 0 ; i <space;++i)System.out.print(" ");
				
				System.out.println(max+" "+last);
				max=0;last="";
				map = new HashMap<String,Integer>();
				continue;
			}
			line =line.replaceAll("[^a-zA-Z]", " ");
			
			String[] split = line.split(" ");
			for(String j : split)
			{
				if(j.equals("")||j.equals(" "))continue;
				if(map.containsKey(j))
				{
					map.put(j, map.get(j)+1);
					if(map.get(j)>max)
					{
						max=map.get(j);
						last = j;
					}
					
				}
				else
				{
					map.put(j, 1);
					if(map.get(j)>max)
					{
						max=map.get(j);
						last = j;
					}
				}
				
			}
			
			
		}
		
		
	}

	
	
	
}
