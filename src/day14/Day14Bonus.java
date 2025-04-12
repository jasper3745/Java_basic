package day14;

import java.util.Scanner;

public class Day14Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("삼각형의 높이를 입력하세요: ");
        int i = sc.nextInt();
        char st = '*';
        char sp = ' ';
        int t = 0;
        for (int n = 1; n <= i; n++) {
            for (int x = i - n; x >= 0; x--) {
                System.out.print(sp);
            }
            for (int t1 = 1; t1 <= n + t; t1++) {
                System.out.print(st);
            }
            System.out.println();
            t = t + 1;
        }
        t = 0;
        for (int n = 1; n <= i; n++) {
            for (int x = i - n; x >= -4; x--) {
                System.out.print(st);
            }
            for (int t1 = 1; t1 <= n + t; t1++) {
                System.out.print(sp);
            }
            System.out.println();
            t = t + 1;
        }
    }
}
