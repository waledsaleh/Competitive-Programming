package Main;

public class TC_480 {

	public static void main(String[] args) {

		System.out.println(encrypt(new int[]	

				{1000,999,998,997,996,995}));
		
	}
	static long encrypt(int[] numbers)
	{
		long res =1;
		long max =Integer.MIN_VALUE;
		for(int i = 0 ; i < numbers.length;++i)
		{
			int num = numbers[i];
			numbers[i]++;
			for(int j = 0 ; j < numbers.length;++j)res *=numbers[j];
			max = Math.max(max, res);
			res =1;
			numbers[i]=num;
			
		}
		
		return max;
		
	}
}
