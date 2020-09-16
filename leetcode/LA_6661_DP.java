import java.util.Scanner;

public class LA_6661_DP {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n, k, s;
        while ((n = sc.nextInt()) != 0 && (k = sc.nextInt()) != 0 && (s = sc.nextInt()) != 0) {

            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; ++i) arr[i] = i;
            System.out.println(sumSets(arr,1,s,k));

            // Another solution
//            int[][] nWays = new int[s + 1][k + 1];
//
//            nWays[0][0] = 1;
//
//            for (int i = 1; i < arr.length; i++) {
//                for (int j = s; j >= arr[i]; j--) {
//                    for (int e = 1; e <= k; e++) {
//                        nWays[j][e] += nWays[j - arr[i]][e - 1];
//                    }
//
//                }
//
//            }
//            System.out.println(nWays[s][k]);
        }
    }

    static int sumSets(int[] arr, int i, int s, int k) {
        if (s == 0 && k == 0)
            return 1;

        if (i >= arr.length)
            return 0;

        if (s < 0 || k <= 0)
            return 0;

        return sumSets(arr, i + 1, s - arr[i], k - 1) + sumSets(arr, i + 1, s, k);
    }
}
