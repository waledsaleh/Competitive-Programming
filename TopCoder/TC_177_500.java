package Main;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC_177_500 {

	public static void main(String[] args) throws IOException {

		System.out.println(oldest(new String[]	

				{"DOUG JONES 22 213 ALDEN LANE","   BOB     A SMITH  102 CLARK ST"}));
		
		
	}
	
	static String oldest(String[] data)
	{
		String oldestName=null;
		int age = Integer.MIN_VALUE;
		Pattern p = Pattern.compile("(.*?)(\\d+) "); // split first name and age into two groups
		for(String student : data)
		{
			Matcher m = p.matcher(student);
			m.find();
			String name = m.group(1);
			int stu_age=Integer.parseInt(m.group(2));
			if(stu_age>age)
			{
				age = stu_age;
				oldestName = name.trim();
				
			}
			
		}
		
		
		return oldestName;
	}
	
}
