package Main;

public class TCHS_SRM41_DIV1 {

	public static void main(String[] args) {

		System.out.println(findMajorityElement(new int[]{249, 326, 564}));
		
		
	}
 static int findMajorityElement(int[] a)
 {
	 int half = a.length>>1, maxOcc=-1,elem=0,n = a.length;
	 int[] occ = new int[1001];
	
	 for(int i = 0 ; i <n;++i)
	 {
		 occ[a[i]]++;
		 if(occ[a[i]]>maxOcc){maxOcc = occ[a[i]];elem=a[i];}
		 
		
	 }
	 
	 
	 return (maxOcc > half ? elem : -1);
	 
 }
}
