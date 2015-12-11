package Main;

public class TCHS07_Alpha_Round1_Div1_250 {

	public static void main(String[] args) {

		
		
		System.out.println(
		numberToTakeOut("t k o h z s v r i c e d n f a m u w p g j q x y l","f"));
		
		
	}
	
 static int numberToTakeOut(String diskNames, String searchingDisk)
 {
	 String[] split = diskNames.split(" ");
	int count=split.length-1, res=0;
	while(!split[count].equals(searchingDisk)){count--;res++;}
	
	
	return res; 
	
	
 }
 
}
