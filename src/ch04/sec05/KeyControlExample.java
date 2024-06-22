package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("-----------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-----------------------------");
            System.out.println("선택: ");
            int chooseNum = scan.nextInt();

            if (chooseNum == 1) {
                System.out.println("선택: " + chooseNum);
                System.out.println("현재 속도 = " + 1);
            } else if (chooseNum == 2) {
                System.out.println("선택: " + chooseNum);
                System.out.println("현재 속도 = " + 0);
            } else if (chooseNum == 3) {
                System.out.println("선택: " + chooseNum);
                System.out.println("프로그램 종료1");
                run = false;
            }
        }

    }
}
