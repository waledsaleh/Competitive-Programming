package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Microsoft_Task_A_WordSearch {
	
	public static void main(String[] args) throws IOException {

		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String s = br.readLine();
	        int n = Integer.parseInt(s);
	        
	        //8 directions
	        
	        int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}, {-1, -1}, {1, -1}, {-1, 1}, {1, 1}};
	        char[][] map = new char[n][n];
	        for (int i = 0; i < n; i++) {
	            map[i] = br.readLine().toCharArray();
	        }
	        
	        boolean[][] vis = new boolean[n][n];
	      
	            boolean finish = true;
	            s = br.readLine();
	           String[] split = s.split(",");
	           
	           for(int count = 0 ; count<split.length;++count)
	           {
	           s= split[count].toUpperCase();
	           
	            boolean check = false;
	            for (int i = 0; i < n; i++) {
	                for (int j = 0; j < n; j++) {
	                    if (map[i][j] == s.charAt(0) && !vis[i][j]) {
	                        String[] temp = new String[8];
	                        Arrays.fill(temp, map[i][j] + "");
	                        int eI = i, eJ = j, c = -1;
	                        for (int k = 1; k < s.length(); k++) {
	                            for (int l = 0; l < 8; l++) {
	                                int x = (dir[l][0] * k) + i, y = (dir[l][1] * k) + j;
	                                if (x >= 0 && x < n && y >= 0 && y < n) {
	                                    if (temp[l].length() < s.length()) {
	                                        temp[l] += map[x][y];
	                                    }
	                                    if (temp[l].compareTo(s) == 0) {
	                                        check = true;
	                                        c = l;
	                                        eI = x + 1;
	                                        eJ = y + 1;
	                                        break;
	                                    }
	                                }
	                            }
	                        }
	                        if (check) {
	                        	if(count ==0)
	                            System.out.print("True");
	                        	else
	                        		System.out.print(",True");
	                        }
	                    }
	                    if (check) {
	                        break;
	                    }
	                }
	                if (check) {
	                    break;
	                }
	            }
	            if (!check) {
	            	
	            	if(count ==0)
	                System.out.print("False");
	            	else
                		System.out.print(",False");
	            	
	            }
	        }
	           System.out.println();
		
	        }
		
	
	
	
	
}
