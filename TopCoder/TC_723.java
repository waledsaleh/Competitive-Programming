public class TC_723 {

    public static void main(String args[]){

        System.out.println(check("buffalo "));


    }
    static  String check(String s)  {

        if(s.charAt(0) == ' ' || s.charAt(s.length()-1) == ' ' || s.length()  < 7)return "Not good";

        String split[] = s.split(" ");

        for(int i = 0; i <split.length; ++i){

          if(!split[i].equals("buffalo") || split[i].equals(" ")) return "Not good";

        }

        return "Good" ;
    }

}
