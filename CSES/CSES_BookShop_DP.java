import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CSES_BookShop_DP {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(line[0]), price = Integer.parseInt(line[1]);
        int[] book = new int[n], page = new int[n];
        line = bufferedReader.readLine().split(" ");
        for (int i = 0; i < n; ++i) book[i] = Integer.parseInt(line[i]);
        line = bufferedReader.readLine().split(" ");
        for (int i = 0; i < n; ++i) page[i] = Integer.parseInt(line[i]);

        int[][] dp = new int[n + 1][price + 1];

        for (int i = 1; i <= n; ++i) {
            for (int j = 0; j <= price; ++j) {
                dp[i][j] = dp[i - 1][j];
                int left = j - book[i - 1];
                if (left >= 0)
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][left] + page[i - 1]);
            }
        }


        System.out.println(dp[n][price]);
    }
}
