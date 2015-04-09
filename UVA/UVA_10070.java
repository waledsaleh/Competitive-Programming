package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class UVA_10070 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer("");
        String m="";
        boolean first=true;
        while((m=br.readLine())!=null){
            if(!first){
                sb.append("\n");
            }
            boolean leap=false,bul=false,hul=false;
            BigInteger x = new BigInteger(m);
            if(x.mod(BigInteger.valueOf(4)).compareTo(BigInteger.ZERO)==0){
                if(x.mod(BigInteger.valueOf(100)).compareTo(BigInteger.ZERO)==0){
                    if(x.mod(BigInteger.valueOf(400)).compareTo(BigInteger.ZERO)==0){
                        leap=true;
                    }
                }else{
                    leap=true;
                }
            }
            if(x.mod(BigInteger.valueOf(15)).compareTo(BigInteger.ZERO)==0){
                hul=true;
            }
            if(x.mod(BigInteger.valueOf(55)).compareTo(BigInteger.ZERO)==0){
                bul=true;
            }
            if(hul||leap){
                if(leap){
                    sb.append("This is leap year.\n");
                }
                if(hul){
                    sb.append("This is huluculu festival year.\n");
                }
                if(leap&&bul){
                    sb.append("This is bulukulu festival year.\n");
                }
            }else{
                sb.append("This is an ordinary year.\n");
            }
            first=false;
        }
        System.out.print(sb);
    }
}