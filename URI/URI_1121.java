package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;


public class URI_1121 {
  
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int n,m,s;
		while(true)
		{
			n = sc.nextInt();
			m = sc.nextInt();
			s = sc.nextInt();
			int X=0,Y=0;
			int count =0;
			if(n==0&&m==0&&s==0)break;
			char arena[][]=new char[n][m], instruction[], orientation=' ';
			for(int i=0; i <n;++i)
			{
				String line = sc.next();
				for(int j =0 ; j <m ;++j)
				{
					arena[i][j]=line.charAt(j);
					 if(arena[i][j]=='N'||arena[i][j]=='L'||arena[i][j]=='O'||arena[i][j]=='S'){
		                    orientation=arena[i][j];
		                    X=i;
		                    Y=j;
		                }
				}
			}
			String inst=sc.next();
			instruction=inst.toCharArray();
			 for(int i=0; i<s; i++){
	                if(instruction[i]=='F'){
	                    if(orientation=='L'){
	                        if(Y<m-1 && arena[X][Y+1]!='#'){
	                                Y++;
	                                if(arena[X][Y]=='*'){
	                                    count++;arena[X][Y]='.';
	                                }
	                        }
	                    }
	                    else{
	                        if(orientation=='S'){
	                            if(X<n-1 && arena[X+1][Y]!='#'){
	                                X++;
	                                if(arena[X][Y]=='*'){
	                                    count++;arena[X][Y]='.';
	 
	                                }
	                            }
	                        }
	                        else{
	                            if(orientation=='N'){
	                                if(X>0 && arena[X-1][Y]!='#'){
	                                    X--;
	                                    if(arena[X][Y]=='*'){
	                                        count++;arena[X][Y]='.';
	 
	                                    }
	                                }
	                            }
	                            else{
	                                if(orientation=='O'){
	                                    if(Y>0 && arena[X][Y-1]!='#'){
	                                        Y--;
	                                        if(arena[X][Y]=='*'){
	                                            count++;arena[X][Y]='.';
	 
	                                        }
	                                    }
	                                }
	                            }
	                        }
	                    }
	                }
	                else{
	                    if(instruction[i]=='D'){
	                        if(orientation=='L')orientation='S';
	                        else if(orientation=='S')orientation='O';
	                             else if(orientation=='O')orientation='N';
	                                  else if(orientation=='N')orientation='L';
	                    }
	                    else{
	                        if(instruction[i]=='E'){
	                            if(orientation=='L')orientation='N';
	                            else if(orientation=='S')orientation='L';
	                                 else if(orientation=='O')orientation='S';
	                                      else if(orientation=='N')orientation='O';
	                        }
	                    }
	                }
	        }
			System.out.println(count);
		}
		
	}
	


 
 
}
