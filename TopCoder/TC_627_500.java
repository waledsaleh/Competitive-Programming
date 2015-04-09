package Main;

public class TC_627_500 {

	public static void main(String[] args) {

		
		
		
		
		
		
	}
   static char getHappyLetter(String letters)
   {
		int[] array = new int[300];
		for(int i = 0 ; i < letters.length();++i)array[letters.charAt(i)]++;
		
		int max = 0;
		int index =0;
		for(int i = 0 ; i < array.length;++i)if(array[i]>max){max = array[i];index =i; }
			
		
		int sum =0;
		array[index]=0;
		for(int i = 0 ; i < array.length;++i){sum +=array[i];}
		
		if(sum <max)return (char)index;
		
		return '.';
   }
}
