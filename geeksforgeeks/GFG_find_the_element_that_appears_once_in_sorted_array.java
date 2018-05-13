import java.util.Scanner;


/*  https://practice.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array/0 */

public class GFG_find_the_element_that_appears_once_in_sorted_array {

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt(), res = sc.nextInt();

            for(int i = 1 ; i < n ; res ^= sc.nextInt(),++i );

            System.out.println(res);

        }

    }

}
