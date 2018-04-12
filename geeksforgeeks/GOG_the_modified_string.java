import java.util.Scanner;

public class GOG_the_modified_string {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0)
        {

            String input = sc.next();

            int res = 0, count = 1;

            for (int i = 1; i < input.length(); ++i) {

                count = input.charAt(i) == input.charAt(i - 1) ? ++count : 1;

                if (count == 3) {

                    count = 1;
                    ++res;
                }
            }

            if (count == 3) {

                ++res;
            }

            System.out.println(res);

        }


    }

}
