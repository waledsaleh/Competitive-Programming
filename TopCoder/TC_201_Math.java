package Main;

public class TC_201_Math {

	public static void main(String[] args) {

		  System.out.println(number(0, Long.parseLong("25"), Long.parseLong("24")));
		  
		   
		
	}
 static long  number ( long min , long max , long factor )
 {
	while(min % factor !=0)min++;
	if(min > max)return 0;
	
    return (max-min) /factor +1; 	
 }
 
 
}
