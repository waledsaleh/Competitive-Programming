package Main;

import java.util.Arrays;
import java.util.Vector;

public class TC_227_500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String[] e = dataCleanup(new String[]	

				{"Banks, Cody", "Cody Banks", "Tod Wilson"});
		
		for(String q : e)System.out.print(q+" ");
		
	}
	
  static 	String[] dataCleanup(String[] names)
  {
	   String[] first = new String[names.length];
	   int f=0,l=0;
	   String[]last = new String[names.length];
	    
	  for(int i = 0 ; i < names.length;++i)
	  {
		  int index = names[i].indexOf(',');
		  if(index !=-1)
		  {
		   String[]split = names[i].split(",");
		   
		   String q =new StringBuilder(split[1]+" "+split[0]).deleteCharAt(0).toString();
		   names[i]=q;
		   split = q.split(" ");
		   first[f]=split[0];
		   f++;
		   
		   last[l]=split[1];
		   l++;
		  }
		  else
		  {
			  String[]split = names[i].split(" ");
			  
			   first[f]=split[0];
			   f++;
			   last[l]=split[1];
			   l++;
			  
		  }
	  }
	  bubble(names,first,last);
	  
	return names;
  }

public static void bubble(String[] names,String[]first,String[]last)
{
    
	for(int i = 0 ;  i < names.length;++i)
	{
		for(int j =i+1;j<names.length;++j)
		{
			if(!last[i].equals(last[j]))
			{
				if(last[i].compareTo(last[j])>0)
				{
				String temp = names[i];
				names[i]=names[j];
				names[j]=temp;
				
				String temp2 = last[i];
				last[i]=last[j];
				last[j]=temp2;
				
				String temp3 = first[i];
				first[i]=first[j];
						first[j]=temp3;
				}
			}
			else
			{
				if(first[i].compareTo(first[j])>0){
				String temp = names[i];
				names[i]=names[j];
				names[j]=temp;
				
				String temp3 = first[i];
				first[i]=first[j];
						first[j]=temp3;
				}
				
			}
		}
	}
	
	
}


}
