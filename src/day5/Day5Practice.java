package day5;

import java.util.Scanner;

public class Day5Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        for (int i = 1; i <= 10; i+=2){
//            System.out.println("i = " + i);
//        }

        // 3번 문제
//        for (int i = 2; i <= 10; i++){
//            if(i % 2 == 0){
//                System.out.println("i = " + i);
//            }
//
//        }

        // 4번 문제
//        System.out.println("출력할 단을 입력하세요. (2~9): ");
//        int dan = sc.nextInt();
//        for (int i = 1; i <= 9; i++){
//            System.out.println(dan + " x " + i + " = " + (dan * i));
//        }

        // 5번 문제

//        System.out.println("출력할 단을 입력하세요. (2~9): ");
//        int dan = sc.nextInt();
//        for (int i = 9; i >= 1; i--) {
//            System.out.println(dan + " x " + i + " = " + (dan * i));
//        }

        //6번 문제

        System.out.println("출력할 단을 입력하세요. (2~9): ");
        int dan = sc.nextInt();
        for (int i = 3; i <= 18; i++){
            if(i == 3 || i == 6 || i == 7 || i == 9 || i == 18){
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
        }
    }
}
