package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Day8Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[][] s = new int[3][3];
        for (int i = 0; i <= 2; i++) {
            System.out.println("학생" + (i + 1) + "의 국어점수를 입력하세요: ");
            s[i][0] = sc.nextInt();
            System.out.println("학생" + (i + 1) + "의 수학점수를 입력하세요: ");
            s[i][1] = sc.nextInt();
            System.out.println("학생" + (i + 1) + "의 영어점수를 입력하세요: ");
            s[i][2] = sc.nextInt();

        }
        int[] sum = {0, 0, 0};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i] += s[i][j];
            }
            System.out.println("학생 " + (i + 1) + "총점: " + sum[i] + ", 평균: " + sum[i] / 3);
        }

        for (int i = 0; i < 3; i++) {

            int max = -999999;
            int min = 999999;
            for(int n = 0; n < 3; n++) {
                if(s[i][n] > max){
                    max = s[i][n];
                }
                if(s[i][n] < min){
                    min = s[i][n];
                }
            }

            System.out.println("학생 " + (i + 1) + " 최고점: " + max + ", 최저점: " + min);
        }
    }
}
