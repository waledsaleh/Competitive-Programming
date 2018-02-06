class TC_728 {


    public static void main(String args[]) {

        System.out.println(count(new int[]{987654321, 1000000000, 998244353, 123456789, 999999999}

                ,1000000000 ));

    }

    static  int count(int[] S, int T){

        int count = 0;

        for(int i = 0 ; i < S.length; ++i){

            S[i] = S[i] == T ? S[i] : S[i] >> 1;

            while( S[i] != T && S[i] != 0)  S[i] >>=  1; // There exist math formula, but time has finished. So I'll write it later :)

            count  += S[i] == T ? 1 : 0;

        }

        return count;
    }


}
