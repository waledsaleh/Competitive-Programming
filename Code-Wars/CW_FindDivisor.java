package Main;

public class CW_FindDivisor {

	//Link : http://www.codewars.com/kata/542c0f198e077084c0000c2e/train/java
	  public long numberOfDivisors(int n) {
	     // TODO please write your code below this comment
	     if(n==0)return 0;
	     
	      long count=0;
	      for(int i = 1 ; i*i<=n;++i){
	       
	        if(n%i==0)
	        {
	        count++;
	        if(i*i!=n){
	        count++;
	        }
	        
	        }
	        
	       
	      
	      }
	 
	      return count;
	  }

	}
