package day2;

import java.util.Scanner;

public class Day2Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("출생 연도를 입력하세요: ");
        int i1 = sc.nextInt();
        System.out.println("당신의 나이는 " + (2025 - i1) + "입니다.");

        System.out.println("사각형의 가로 길이를 입력하세요: ");
        double d1 = sc.nextDouble();
        System.out.println("사각형의 세로 길이를 입력하세요: ");
        double d2 = sc.nextDouble();
        System.out.println("사각형의 넓이는 " + (d1 * d2) + " 입니다.");

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int i2 = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요: ");
        int i3 = sc.nextInt();
        System.out.println(i2 + " + " + i3 + " = " + (i2 + i3));
        System.out.println(i2 + " - " + i3 + " = " + (i2 - i3));
        System.out.println(i2 + " * " + i3 + " = " + (i2 * i3));
        System.out.println(i2 + " / " + i3 + " = " + (i2 / i3));
        System.out.println(i2 + " % " + i3 + " = " + (i2 % i3));





    }
}
