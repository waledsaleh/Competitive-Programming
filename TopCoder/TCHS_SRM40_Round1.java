package Main;
import java.util.*;
public class TCHS_SRM40_Round1 {

	public static void main(String[] args) {

		System.out.println(wrongOrdering(new String[]{"ACCOUNTING"
				,"MARKETING"
				,"PERSONNEL"
				,"FINANCE"
				,"SALES"
				,"ADMINISTRATION"
				,"IT"
				,"MANAGEMENT"
				,"OPERATIONS"
				,"LEGAL"
				,"PURCHASING"
				,"LOGISTICS"
				,"TRAINING"
				,"TECHNICAL"}));
		
	}
 static String wrongOrdering(String[] files)
 {
	TreeMap<String,String>map = new TreeMap<String,String>();
	 
	for(String word : files)map.put(new StringBuilder(word).reverse().toString(), word);
	
	return  map.firstEntry().getValue();
	
 }
}
