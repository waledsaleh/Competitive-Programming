package Main;

import java.util.Set;

public class TCHS_Delta_Round3_Div1{

	public static void main(String[] args) {

		
		
	}
static int numberOfRejections(int[] requests)
{
	Set<Integer>set = new HashSet<Integer>();
	int count =0;
	for(Integer i : requests)
	{
		if(set.contains(i))count++;
		else
			set.add(i);
	}
	
	return count;
	
}
}
