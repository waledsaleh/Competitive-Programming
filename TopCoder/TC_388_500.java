package Main;

public class TC_388_500 {

	public static void main(String[] args) {

		System.out.println(minimumVotes(new int[]	

				{10}));
		
	}
	static int minimumVotes(int[] votes)
	{
		int count =0;
		if(votes.length==1)return 0;
		while(true)
		{
		   	
		int i = index(votes);
			if(votes[0]>votes[i])break;
			
				votes[0]++;
				--votes[i];
				count++;
			
		}

		
		return count;
		
	}
	public static int index (int[] array)
	{
		int index =0;
		int max =0;
		for(int i = 1 ; i <array.length;++i)
		{
			if(array[i]>max)
			{
				max = array[i];
				index = i;
			}
		}
		return index;
	}
}
