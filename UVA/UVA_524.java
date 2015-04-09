package Main;
import java.util.ArrayList;
import java.util.Scanner;
 
public class UVA_524 {
    static int[] num;
        static boolean[] taken;
        static boolean[] prime;
        static ArrayList<String>[] list;
        static boolean[] found;
 
        public static void solve(int i, String s) {
                if (i == taken.length-1) {
                        if (prime[num[num.length-1] + 1]){
                                list[num.length].add(s.substring(0, s.length() - 1));
                                found[num.length]=true;
                        }return;
                }
                for (int j = 2; j <taken.length; j++) {
                        if(!taken[j]&&prime[num[i-1]+j]){
                                taken[j]=true;
                                num[i]=j;
                                solve(i+1, s+j+" ");
                                taken[j]=false;
                        }
                }
        }
        public static void main(String[] args) {
                list=new ArrayList[17];
                found=new boolean[17];
                prime=new boolean[32];
                prime[2]=prime[3]=prime[5]=prime[7]=prime[11]=prime[13]=prime[17]=prime[19]=prime[23]=prime[29]=prime[31]=true;
                for (int i = 0; i < list.length; i++) 
                        list[i]=new ArrayList<String>();
                for (int i = 2; i <17; i++) {
                        num=new int[i];
                        num[0]=1;
                        taken=new boolean[i+1];
                        solve(1, "1 ");
                }
                list[1].add("1");
                
                Scanner in=new Scanner(System.in);
                int count=1;
                while(in.hasNext()){
                        if(count>1)
                                System.out.println();
                        int n=in.nextInt();
                        System.out.println("Case "+count+":");
                        StringBuilder sb=new StringBuilder();
                        for(String x:list[n])
                        	sb.append(x+"\n");
                        if(sb.length()>0)
                                System.out.println(sb.substring(0, sb.length()-1));
                        count++;
                }
        }
}