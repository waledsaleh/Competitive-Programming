class TC_728 {


    public static void main(String args[]) {

        System.out.println(count(new int[]{3},1 ));

    }

    static  int count(int[] S, int T){

        int count = 0;

        for(int i = 0,div = 0 ; i < S.length; ++i){

            div = S[i] == T ? S[i] : S[i] >> 1;

            while(div  != T && div != 0)  div >>=  1;

            count  += div == T ? 1 : 0;

        }

        return count;
    }


}
