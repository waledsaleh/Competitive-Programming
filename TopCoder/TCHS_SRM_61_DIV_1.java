import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TCHS_SRM_61_DIV_1 {

    public String fixTheSpell(String spell) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < spell.length(); ++i)
            if (spell.charAt(i) == 'A' || spell.charAt(i) == 'Z') list.add(spell.charAt(i));

        Collections.reverse(list);
        char[] ch = spell.toCharArray();
        for (int i = 0, j = 0; i < ch.length; ++i)
            if (ch[i] == 'A' || ch[i] == 'Z') ch[i] = list.get(j++);

        return new String(ch);
    }
}
