package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Day6Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 1) {
//                continue;
//            }
//            System.out.println(i);
//        }


//        System.out.println("숫자를 입력하세요: ");
//        int i = sc.nextInt();
//        int t = 0;
//        for(int n = 1; n <= i; n++){
//            t = n + t;
//
//            if (t >= 50) {
//                System.out.println("합계가 50을 넘었습니다. 반복 종료!");
//                break;
//            }
//            System.out.println("현재 합계: " + t);
//
//        }
//        System.out.println("최종 합계: " + t);

//        System.out.println("삼각형의 높이를 입력하세요: ");
//        int i = sc.nextInt();
//        char s = '*';
//        for(int n = 1; n <= i; n++){
//            for(int t = 1; t <= n; t++){
//                System.out.print(s);
//            }
//            System.out.println();
//        }

//        System.out.println("삼각형의 높이를 입력하세요: ");
//        int i = sc.nextInt();
//        char st = '*';
//        char sp = ' ';
//        int t = 0;
//        for (int n = 1; n <= i; n++) {
//            for (int x = i - n; x >= 0; x--) {
//                System.out.print(sp);
//            }
//            for (int t1 = 1; t1 <= n + t; t1++) {
//                System.out.print(st);
//            }
//            System.out.println();
//            t = t + 1;
//        }

        //괴생명체2
        int i = sc.nextInt();
        char st = '*';
        char sp = ' ';
        int t = 0;
        for (int n = 1; n <= i; n++) {
            for (int x = i - n; x >= 0; x--) {
                System.out.print(sp);
                for (int t1 = 1; t1 <= n + t; t1++) {
                    System.out.print(st);
                }
            }
            System.out.println();
        }
    }
}


