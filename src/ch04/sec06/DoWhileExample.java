package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");
//        boolean run = true;
//        while(run) {
//            Scanner scan = new Scanner(System.in);
//            System.out.println(">");
//            String incomeText = scan.nextLine();
//            System.out.println(incomeText);
//            if(incomeText.equals("q")) {
//                System.out.println("프로그램 종료");
//                run=false;
//            }
//        }
        Scanner scanner = new Scanner(System.in);
        String inputString;
        do {
            System.out.println(">");
            inputString = scanner.nextLine();
            System.out.println(inputString);
        } while (!inputString.equals("q"));

        System.out.println();
        System.out.println("프로그램 종료");
    }
}
