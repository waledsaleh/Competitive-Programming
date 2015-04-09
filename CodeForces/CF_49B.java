package Main;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CF_49B {
   
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		int ans =1;
		for(int i =1 ; i <=10;++i)
		{
			try
			{
			int aa  = Integer.parseInt(a,i);
			int bb = Integer.parseInt(b,i);
			ans = Math.max(ans, (Integer.toString(aa+bb, i)).length());
			}
			catch(NumberFormatException e){
			}
			
			
		}
		System.out.println(ans);
	}

}
 