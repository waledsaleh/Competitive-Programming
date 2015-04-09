package Main;

public class TC_628 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
   static int howManyMoves(int r1, int c1, int r2, int c2)
   {
	   r1++;r2++;c1++;c2++;
	   
	   if(((r1+c1)&1) !=((r2+c2)&1))return -1;
	   if(r1==r2&&c1==c2)return 0;
	   if(r1+c1==r2+c2||r1-c1==r2-c2)return 1;
	   
	   return 2;
	   
	   
   }
}
