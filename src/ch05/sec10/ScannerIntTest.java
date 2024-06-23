package ch05.sec10;

import java.util.Scanner;

public class ScannerIntTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int studentNum = 0;
        int scores[] = null;
        int maxNum = 0;
        int avgNum = 0;
        while (run) {
            System.out.println("-----------------------------------------");
            System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
            System.out.println("-----------------------------------------");

            System.out.print("선택>");
            int inputNum = scan.nextInt();
            switch (inputNum) {
                case 1:
                    System.out.print("학생수>");
                    studentNum = scan.nextInt();
                    scores = new int[studentNum];
                    break;
                case 2:
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print("scores[" + i + "]>");
                        scores[i] = scan.nextInt();
                    }
                    break;
                case 3:
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "]:" + scores[i]);
                    }
                    break;
                case 4:
                    for (int i = 0; i < scores.length; i++) {
                        if (maxNum < scores[i]) {
                            maxNum = scores[i];
                        }
                    }
                    System.out.println("최고 점수:" + maxNum);
                    System.out.println("평균 점수:" + (double) maxNum / studentNum);
                case 5:
                    System.out.println("프로그램 종료");
                    run = false;
            }
        }
    }
}
