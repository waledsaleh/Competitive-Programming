import java.util.Scanner;

public class CSES_RemovingDigits {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);


        // Another solution - Greedy solution
        int n = sc.nextInt(), count = 0;

        while (n != 0) {

            int max = 0, subN = n;
            while (subN != 0) {
                int rem = subN % 10;
                if (rem > max)
                    max = rem;

                subN /= 10;
            }
            count++;
            n -= max;
        }
        System.out.print(count);

    }
}
