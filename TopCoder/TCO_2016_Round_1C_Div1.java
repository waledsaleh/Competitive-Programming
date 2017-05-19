package Main;
import java.util.*;
public class TCO_2016_Round_1C_Div1 {

	public static void main(String[] args) {

		  Scanner in = new Scanner(System.in);
	 
		  	  System.out.println(isSumFullSet(new int[]{-1,0,1}));
		
	}
 static String isSumFullSet(int[] elements){
	 
	 if(elements.length==1)return "closed";
	 Arrays.sort(elements);
	 
	 for(int i=0;i<elements.length;++i){
		 for(int j=i+1;j<i;++j){
			 if(i!=j&&Arrays.binarySearch(elements,elements[i]+elements[j])<=-1)return"not closed";
			 
			 
		 }
		 
	 }
	 
	 return "closed";
	 
	 
 }
 
}
