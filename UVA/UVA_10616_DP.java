import java.util.Arrays;
import java.util.Scanner;

public class UVA_10616_DP {

    static long[][][] memo2;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n, q;
        int set = 1;
        StringBuilder sb = new StringBuilder();

        while ((n = sc.nextInt()) != 0 && (q = sc.nextInt()) != 0) {
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i) arr[i] = sc.nextInt();

            int queryCount = 1;
            sb.append("SET ").append(set).append(":").append("\n");

            for (int i = 1; i <= q; ++i) {
                int d = sc.nextInt(), m = sc.nextInt();

                memo2 = new long[d + 1][m + 1][n + 1];

                for (long[][] row : memo2) {
                    for (long[] rowColumn : row) {
                        Arrays.fill(rowColumn, -1);
                    }
                }

                sb.append("QUERY ").append(queryCount).append(": ").append(countGroups(arr, d, m, 0, 0, 0)).append("\n");

                queryCount++;
            }

            set++;
        }
        sb.deleteCharAt(sb.length() - 1); // remove last space

        System.out.println(sb);

    }

    static long countGroups(int[] arr, int d, int m, int i, int sum, int count) {
        if (sum == 0 && count == m)
            return 1;

        if (i >= arr.length)
            return 0;

        if (count > m)
            return 0;

        if (memo2[sum][count][i] != -1)
            return memo2[sum][count][i];

        int t = (sum + arr[i]) % d;   // if arr[i] is negative and brings sum below 0
        if (t < 0) t += d;         // increase by d to make it bigger than 0

        return memo2[sum][count][i] = countGroups(arr, d, m, i + 1, t, count + 1) + countGroups(arr, d, m, i + 1, sum, count);
    }
}
