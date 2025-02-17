package day7;

import java.util.Scanner;

public class Day7Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        char[] chars = new char[4];
//        chars[0] = 'c';
//        chars[1] = 'h';
//        chars[2] = 'a';
//        chars[3] = 'r';
//
//        int[] ints = {85,90,78,92,88};
//
//        for(int i= 0; i < ints.length; i++){
//            System.out.println(ints[i]);
//        }

        int len = sc.nextInt();
        int[] arr = new int[len]; // []
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int n = 0; n < arr.length; n++){
            System.out.println(arr[n]);
        }
    }
}
