public class TC_279 {
    public String makeDancing(String sentence) {
        StringBuilder result = new StringBuilder();
        boolean isUpper = false;
        for (int i = 0; i < sentence.length(); ++i) {
            char ch = sentence.charAt(i);
            if (Character.isAlphabetic(ch)) {
                ch = !isUpper ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
                isUpper = !isUpper;
            }
            result.append(ch);
        }

        return result.toString();
    }
}
