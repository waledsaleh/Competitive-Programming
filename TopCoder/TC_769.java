public class TC_769 {
    public int count(String meadow) {

        int count = 0;
        for (int i = 0; i < meadow.length() - 1; ++i) {

            if (meadow.charAt(i) == '(' && meadow.charAt(i + 1) == '|')
                count++;
            else if (meadow.charAt(i) == '|' && meadow.charAt(i + 1) == ')')
                count++;
            else if (meadow.charAt(i) == '(' && meadow.charAt(i + 1) == ')')
                count++;
        }
        return count;
    }
}
