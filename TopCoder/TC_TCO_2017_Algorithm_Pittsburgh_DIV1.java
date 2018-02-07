

class TC_TCO_2017_Algorithm_Pittsburgh_DIV1 {

    public static void main(String args[]){

        System.out.println(isMatch("nl91gn9lnnqpyo09ml1h140onnomoonr0ow24qfw0muf","nl9lgn91nmqpy009ml1hl4o0nm0mo0nro0w24qfwonuf"));

    }

    static	String isMatch(String S, String T){

        for(int  i = 0 ; i <S.length(); ++i){

            if( (S.charAt(i) == 'o' || S.charAt(i) == '0') && (T.charAt(i) == 'o' || T.charAt(i) == '0')
                    || (S.charAt(i) == 'l' || S.charAt(i) == '1') && (T.charAt(i) == 'l' || T.charAt(i) == '1')
                    ||(S.charAt(i) == 'm' || S.charAt(i) == 'n') && (T.charAt(i) == 'm' || T.charAt(i) == 'n')) continue;

            if(S.charAt(i) != T.charAt(i)) return "Impossible";

        }

        return "Possible";

    }
}

