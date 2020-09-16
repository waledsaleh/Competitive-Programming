import java.util.*;

public class CF_1385B {


    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int[] arr = new int[2 * n];

            for (int i = 0; i < arr.length; ++i) arr[i] = sc.nextInt();

            Set<Integer> set = new LinkedHashSet<>();
            for (int i = 0; i < arr.length; ++i) set.add(arr[i]);

            List<Integer> res = new ArrayList<>(set);

            for(int i =0; i < res.size(); ++i)System.out.print(res.get(i)+" ");

            System.out.println();
        }


    }

}
