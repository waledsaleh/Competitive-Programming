import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UVA_1213_DP {
    static long[][][] memo2;
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n, k;

        StringBuilder sb = new StringBuilder();

        while ((n = sc.nextInt()) != 0 && (k = sc.nextInt()) != 0) {

            if (n == 1) {
                sb.append(0).append("\n");
                continue;
            }
            memo2 = new long[n + 1][187][15];

            for (long[][] row : memo2) {
                for (long[] rowColumn : row) {
                    Arrays.fill(rowColumn, -1);
                }
            }

            List<Integer> primes = new ArrayList<>();

            generatePrimes(n, primes);

            sb.append(countSets(n, k, primes,  0)).append("\n");
        }
        System.out.print(sb);
    }
    static long countSets(int n, int k, List<Integer> primes, int i) {
        if (k == 0 && n == 0)
            return 1;

        if (i >= primes.size() || i >= 187 || k == 0)
            return 0;

        if (n < 0)
            return 0;

        if (memo2[n][i][k] != -1)
            return memo2[n][i][k];

        return memo2[n][i][k] = countSets(n - primes.get(i), k-1, primes,  i + 1) + countSets(n, k, primes, i + 1);
    }
    static void generatePrimes(int n, List<Integer> list) {

        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        for (int i = 2; i * i <= n; ++i) {

            if (prime[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; ++i)
            if (prime[i])
                list.add(i);

    }
}
