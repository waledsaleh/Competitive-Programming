import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UVA_729 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 1; i <= t; ++i) {

            sc.nextLine();

            if (i > 1)
                System.out.println();

            int n = sc.nextInt(), h = sc.nextInt();

            int[] arr = new int[n];
            List<String> bits = new ArrayList<>();

            generateBits(n, arr, bits);

            Collections.sort(bits);

            for (int k = 0; k < bits.size(); ++k) {
                int countOnes = numOfOnes(bits.get(k));
                if (countOnes == h)
                    System.out.println(bits.get(k));
            }

        }

    }

    public static int numOfOnes(String bit) {
        if (bit.length() == 0) return 0;

        if (bit.charAt(0) == '1')
            return 1 + numOfOnes(bit.substring(1));

        return numOfOnes(bit.substring(1));
    }

    public static void generateBits(int n, int[] arr, List<String> bits) {

        if (n < 1) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < arr.length; ++i) {
                result.append(arr[i]);
            }
            bits.add(result.toString());
            return;
        }
        arr[n - 1] = 0;
        generateBits(n - 1, arr, bits);

        arr[n - 1] = 1;
        generateBits(n - 1, arr, bits);
    }

    /* Another solution*/

    public static String generateBits(int N, int H) {
        String temp = "";

        for (int j = 0; j < (1 << N); j++) {
            boolean stat = Integer.bitCount(j) == H;
            if (stat)
                temp = Integer.toBinaryString(j);
            for (int z = temp.length(); z < N; z++)
                temp = "0" + temp;
            if (stat)
                System.out.println(temp);

        }
        return temp;
    }
}
