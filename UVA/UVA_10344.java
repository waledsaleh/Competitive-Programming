package Main;

import java.util.Arrays;
import java.util.Scanner;
 
public class UVA_10344{
    static boolean flag = false;
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
 
        while (true) {
            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0 && arr[3] == 0
                    && arr[4] == 0)
                break;
            Arrays.sort(arr);
 
            do {
                checkFor23(arr, 0, arr[0]);
 
            } while (permuteLexically(arr) && !flag);
 
            if (flag)
                System.out.println("Possible");
            else
                System.out.println("Impossible");
 
            flag = false;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
        }
 
    }
 
    private static void checkFor23(int[] arr, int i, int total) {
        if (i == 4 && total == 23) {
            flag = true;
        }
        i++;
        if (!flag && i < 5) {
            checkFor23(arr, i, total + arr[i]);
            checkFor23(arr, i, total - arr[i]);
            checkFor23(arr, i, total * arr[i]);
        }
    }
 
    public static boolean permuteLexically(int[] data) {
        int k = data.length - 2;
        while (data[k] >= data[k + 1]) {
            k--;
            if (k < 0) {
                return false;
            }
        }
        int l = data.length - 1;
        while (data[k] >= data[l]) {
            l--;
        }
        swap(data, k, l);
        int length = data.length - (k + 1);
        for (int i = 0; i < length / 2; i++) {
            swap(data, k + 1 + i, data.length - i - 1);
        }
        return true;
    }
 
    private static void swap(int[] data, int k, int l) {
        int x = data[k];
        data[k] = data[l];
        data[l] = x;
 
    }
}