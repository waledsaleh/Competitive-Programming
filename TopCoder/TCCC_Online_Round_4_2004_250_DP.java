import java.util.Arrays;
import java.util.Scanner;

public class TCCC_Online_Round_4_2004_250_DP {
    static int[] memo;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);


        System.out.println(maxDonations(new int[]{10, 3, 2, 5, 7, 8}));
    }

    static int maxDonations(int[] donations) {
        memo = new int[101];
        Arrays.fill(memo, -1);
        int max1 = maxDonate(donations, 0, false);
        Arrays.fill(memo, -1);
        int max2 = maxDonate(donations, 1, true);
        return Math.max(max1, max2);
    }

    static int maxDonate(int[] arr, int i, boolean useEnd) {
        if (i >= arr.length)
            return 0;

        if (memo[i] != -1)
            return memo[i];

        if (i == arr.length - 1 && useEnd)
            return arr[i];

        if (i == arr.length - 1)
            return 0;

        int pick = maxDonate(arr, i + 2, useEnd) + arr[i];

        int left = maxDonate(arr, i + 1, useEnd);

        return memo[i] = Math.max(pick, left);
    }
}
