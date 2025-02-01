package day4;

import java.util.Scanner;

public class Day4Practice {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

//        System.out.println("첫 번째 숫자를 입력하세요: ");
//        int num1 = sc.nextInt();
//        System.out.println("두 번쨰 숫자를 입력하세요: ");
//        int num2 = sc.nextInt();
//        System.out.println("세 번째 숫자를 입력하세요: ");
//        int num3 = sc.nextInt();
//
//        int maxNum = (num1 > num2) ? num1 : num2;
//        maxNum = (maxNum > num3) ? maxNum : num3;
//        System.out.println("더 큰 숫자는 " + maxNum + "입니다.");

//        System.out.println("월을 입력하세요 (1~12): ");
//        int month = sc.nextInt();
//        int weather = (month % 12) / 3;
//
//        switch (weather) {
//            case 0:
//                System.out.println("겨울");
//                break;
//            case 1:
//                System.out.println("봄");
//                break;
//            case 2:
//                System.out.println("여름");
//                break;
//            case 3:
//                System.out.println("가을");
//                break;
//        }
        System.out.println("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.println("연산자를 입력하세요 (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();


        int result = 0;

        switch (operator) {

            case '+':
                 result = num1 + num2;
                 break;
            case '-':
                 result = num1 - num2;
                 break;
            case '*':
                 result = num1 * num2;
                 break;
            case '/':
                 result = num1 / num2;


        }

        System.out.println("결과: " + result);

    }
}
