package Main;

public class TC_640 {

	public static void main(String[] args) {

		
		
		
		
	}
	static int solve(int[] col, int[] x, int[] y)
	{
		int count =0;
		for(int i = 0; i < x.length;++i)
		{
			if(col[x[i]-1]!=col[y[i]-1])
				count++;
			
			
		}
		return count;
	}
}
