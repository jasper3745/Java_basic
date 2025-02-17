package day7;

import java.util.Scanner;

public class Day7Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("학생 수를 입력하세요:");
//        int len = sc.nextInt();
//        int[] s = new int[len];
//        int t = 0;
//
//        for(int n = 0; n < s.length; n++){
//            System.out.println("학생들의 점수를 입력해주세요. 학생 " + (n + 1) + ": ");
//            s[n] = sc.nextInt();
//            t = s[n] + t;
//
//        }System.out.println("학생들의 평균 점수는: " + (t / len));

        int len = sc.nextInt();
        int[] arr = new int[len];
        int max = -999999;
        int min = 999999;
        for(int n = 0; n < len; n++) {
            System.out.println("숫자를 하나 입력해주세요:");
            arr[n] = sc.nextInt();
            if(arr[n] > max){
                max = arr[n];
            }
            if(arr[n] < min){
                min = arr[n];
            }

        }System.out.println("최댓값은: " + max);
        System.out.println("최솟값은: " + min);


        for (int ww : arr) {
            System.out.println("ww = " + ww);
        }
    }
}
