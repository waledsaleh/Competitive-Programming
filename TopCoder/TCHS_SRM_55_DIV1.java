package Main;
import java.util.*;

public class TCHS_SRM_55_DIV1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	System.out.println(maximumPupils(new String[]{
			"YYYYYYN","YYYYNYY","NYYYNYY","NYYYYYN","YYYYYYN","NYYNYNY","YYYYYYY"}));
		
		
	}
 static int maximumPupils(String[] seats){
     
	 int count =0;
	 for(int i =0; i < seats.length;++i){
	
		 for(int j =0 ; j <seats[0].length();++j){
			 if(seats[i].charAt(j)=='Y'){count++;j++;}
			
			
		 }
		 
		 
	 }
	 return count;
 }
 
 
}
