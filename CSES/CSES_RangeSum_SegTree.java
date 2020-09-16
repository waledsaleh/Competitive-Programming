import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CSES_RangeSum_SegTree {

    static int n, q;
    static long[] arr, seg;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());
        arr = new long[n];
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        seg = new long[4 * n];

        build(1, 0, n - 1);
        StringBuilder sb = new StringBuilder();
        while (q-- > 0) {
            st = new StringTokenizer(bf.readLine());

            int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
            sb.append(get(1, 0, n - 1, --l, --r)).append("\n");

        }
        System.out.print(sb);

    }

    static void build(int p, int s, int e) {
        if (s == e) {
            seg[p] = arr[s];
            return;
        }

        build(2 * p, s, (s + e) / 2);
        build(2 * p + 1, (s + e) / 2 + 1, e);

        seg[p] = seg[2 * p] + seg[2 * p + 1];
    }

    static void update(int p, int s, int e, int i, int v) {
        if (s == e) {
            seg[p] = v;
            return;
        }

        if (i <= (s + e) / 2) update(2 * p, s, (s + e) / 2, i, v);
        else update(2 * p + 1, (s + e) / 2 + 1, e, i, v);

        seg[p] = seg[2 * p] + seg[2 * p + 1];
    }

    static long get(int p, int s, int e, int a, int b) {
        if (s >= a && e <= b)
            return seg[p];

        if (s > b || e < a)
            return 0;

        return get(2 * p, s, (s + e) / 2, a, b) + get(2 * p + 1, (s + e) / 2 + 1, e, a, b);
    }
}
