package Main;

import java.io.IOException;

public class TC_375 {

	
	public static void main(String[] args) throws IOException {

		System.out.println(getDensity(new String[]{"200 ml of oil, weighing 180 g"}));
		
		
		
	}
	static double getDensity(String[] ingredients)
	{
		int vol =0;
		int mass=0;
		
		for(int i = 0 ; i < ingredients.length;++i)
		{
			String[] split = ingredients[i].split(" ");
			
					vol +=Integer.parseInt(split[0]);
					
	mass +=Integer.parseInt(split[split.length-2]);
				
		}
		return (double)mass/vol;
	}
	
}
