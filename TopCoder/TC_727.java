

public class TC_727 {

    public static void main(String args[]) {

        System.out.println(solve("BOB"));


    }

    static String solve(String S){

        if(S.length() ==  1 || S.length() == 2)return "Impossible";

        for(int i = 1; i < S.length()-1; ++i){

            if(S.charAt(i+1) == S.charAt(i-1) || S.charAt(i-1) == S.charAt(i) || S.charAt(i+1) == S.charAt(i))
                return "Possible";

        }

        return "Impossible";
    }

}

