import java.util.Scanner;

public class CF_894A {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int count = 0;
        for (int i = 0; i < str.length(); ++i) {
            for (int j = i + 1; j < str.length(); ++j) {
                for (int k = j + 1; k < str.length(); ++k) {

                    if ((str.charAt(i) + "" + str.charAt(j) + "" + str.charAt(k)).equals("QAQ"))
                        count++;
                }
            }


        }
        System.out.println(count);
    }
}
