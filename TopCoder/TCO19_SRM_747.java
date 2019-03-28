package com.think;

public class TCO19_SRM_747 {
    public String isItHim(String firstName, String lastName) {

        if (firstName.length() < 7 || lastName.length() < 7)
            return "It is someone else";

        if (firstName.charAt(0) != 'B' || lastName.charAt(0) != 'C')
            return "It is someone else";

        return countChar(firstName, "BENEDICT") < 3 ? "It is someone else" : countChar(lastName, "CUMBERBATCH") < 5 ? "It is someone else" : "It is him";
    }

    private int countChar(String name, String word) {
        int count = 0;

        for (int i = 0; i < name.length(); ++i) {
            for (int j = 0; j < word.length(); ++j) {
                if (name.charAt(i) == word.charAt(j)) {
                    ++count;
                    break;
                }
            }
        }

        return count;
    }
}
