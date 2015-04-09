package Main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UVA_10363  {

	
	public static void main(String[] args) throws IOException, FileNotFoundException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	/*static char map[3][3];
	char checkWin(char c)
	{
	    return
	    (map[0][0]==c&&map[0][1]==c&&map[0][2]==c)||
	    (map[1][0]==c&&map[1][1]==c&&map[1][2]==c)||
	    (map[2][0]==c&&map[2][1]==c&&map[2][2]==c)||
	    (map[0][1]==c&&map[1][1]==c&&map[2][1]==c)||
	    (map[0][0]==c&&map[1][0]==c&&map[2][0]==c)||
	    (map[0][0]==c&&map[1][1]==c&&map[2][2]==c)||
	    (map[0][2]==c&&map[1][1]==c&&map[2][0]==c);
	}
	int main()
	{
	    int c,i,j,x,o,wx,wo;
	    scanf("%d",&c);
	    while(c-->0)
	    {
	        getchar();
	        x = 0;
	        o = 0;
	        for(i=0;i<3;i++)
	        {
	            for(j=0;j<3;j++)
	            {
	                map[i][j]=getchar();
	                if(map[i][j]=='X')
	                    x++;
	                if(map[i][j]=='O')
	                    o++;
	            }
	            getchar();
	        }
	        wx = checkWin('X');
	        wo = checkWin('O');
	        if((wx&&wo)||(wx&&x-o!=1)||(wo&&x-o!=0)||(x-o!=1&&x-o!=0))
	            cout<<("no\n");
	        else
	            cout<<("yes\n");

	    }
	*/
}
}
