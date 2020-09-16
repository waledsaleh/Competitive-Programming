import java.util.Scanner;

public class CF_1385C {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i) arr[i] = sc.nextInt();

            int j = n - 1;
            while (j > 0 && arr[j] <= arr[j - 1]) j--;
            while (j > 0 && arr[j] >= arr[j - 1]) j--;

            System.out.println(j);
        }
    }
}
