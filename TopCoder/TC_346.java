package Main;

public class TC_346 {

	public static void main(String[] args) {

		System.out.println(countDiamonds("><<><>>><"));
		
	}
 static int countDiamonds(String mine)
 {
	
	int count =0;
	while(mine.contains("<>"))
	{
		mine = mine.replaceFirst("<>","");
		count++;
		
		
	}
	return count;
 }
 
}
