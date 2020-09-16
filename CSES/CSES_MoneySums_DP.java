import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class CSES_MoneySums_DP {
    static int[][] memo2;
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sizeArray = bufferedReader.readLine();
        int n = Integer.parseInt(sizeArray);
        int[] arr = new int[n];

        String[] split = bufferedReader.readLine().split(" ");
        for (int i = 0; i < split.length; ++i) {
            arr[i] = Integer.parseInt(split[i]);
        }

//        Set<Integer> treeSet = new TreeSet<>();
        memo2 = new int[n + 1][100000];

        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<>();

        sumCombination(arr, set, 0, 0);
        List<Integer> res = new ArrayList<>(set);

        Collections.sort(res);

        System.out.println(res.size());
        res.forEach(x -> {
            sb.append(x).append(" ");
        });
        System.out.println(sb);
    }

    static void sumCombination(int[] arr, Set<Integer> set, int i, int sum) {

        if (i == arr.length) {
            if (sum != 0) {
                set.add(sum);
                memo2[i][sum] = sum;
            }
            return;
        }
        if (sum != 0)
            set.add(sum);

        if (memo2[i][sum] != 0)
            return;

        sumCombination(arr, set, i + 1, sum + arr[i]);
        sumCombination(arr, set, i + 1, sum);
        memo2[i][sum] = sum;
    }
}
