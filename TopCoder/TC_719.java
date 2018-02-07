import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TC_719 {

    public static void main(String args[]){

        System.out.println(donate(new String[]{"je", "le", "ai", "deja", "vu", "et", "je", "le", "veux", "encore"}
                ,new String[]{"i", "am", "having", "deja", "vu", "please", "stop", "the", "encore"}

        ));

    }

    static  int donate(String[] speech, String[] words) {

        Collection<String> exciteWords = new ArrayList<>(Arrays.asList(words)),
                speechWords = new ArrayList<>(Arrays.asList(speech));

         speechWords.retainAll(exciteWords);

        return speechWords.size();

    }

}
