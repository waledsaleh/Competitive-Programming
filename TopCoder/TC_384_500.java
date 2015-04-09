package Main;

import java.io.IOException;
import java.util.HashSet;

public class TC_384_500 {

	public static void main(String[] args) throws IOException {
		
		String[] records={"a b c","a b d","b b c","b b d","e c d","e c b","e c c","t d e"};
		String[] userGroups=  {"c","d","x"};
		String[]roomRights= {"a","b","c"};
		
		System.out.println(documentAccess(records,userGroups,roomRights));
		
	}
	
	static int documentAccess(String[] records, String[] userGroups, String[] roomRights)
	{
		boolean first=false,sec=false;
		HashSet<String>user = new HashSet<String>();
		HashSet<String>room = new HashSet<String>();
		
		for(int i = 0 ; i <userGroups.length;++i )user.add(userGroups[i]);
		for(int i = 0 ; i < roomRights.length;++i)room.add(roomRights[i]);
		
		int count =0;
		
		for(int i = 0 ; i < records.length;++i)
		{
			first=false;
			sec =false;
			if(records[i].equals(""))continue;
			String[] split = records[i].split(" ");
			if(user.contains(split[2]))first=true;
			if(room.contains(split[1]))sec=true;
			
			if(first&&sec)
			{
				count++;
				String[] s1 = records[i].split(" ");
			
			boolean f1=false,f2=false;
				for(int j = i+1 ; j < records.length;++j)
				{
					f1=false;f2=false;
					String[] s2 = records[j].split(" ");
					if(i==j) continue;
					if(s1[0].equals(s2[0]))
					{
						if(user.contains(s2[2]))f1=true;
						if(room.contains(s1[1]))f2=true;
						
					}
					
					if(f1 && f2)
					{
						records[j]="";
						//count--;
					}
				}
			
				
			}
			
		}
		
		return count;
	}
	
}
