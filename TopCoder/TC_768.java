public class TC_768 {
    static int maxPref(String s) {
        String alph = "abcdefghijklmnopqrstuvwxyz";

        int count = 0;
        for (int i = 0, j = 0; i < s.length(); ++i) {
            if (s.charAt(i) == alph.charAt(j)) {
                count++;
                j++;
            } else
                break;

        }

        return count;

    }
}
