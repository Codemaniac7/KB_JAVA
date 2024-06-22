package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("x 값 입력: ");
////        String strX = scanner.nextLine();
////        int x = Integer.parseInt(strX);
//        int x = scanner.nextInt();
//
//        System.out.println("y값 입력 : ");
//        int y = scanner.nextInt();
//        int result = x+ y;
//        System.out.println("x+y : "+result);

        String inStr = "";
        while (true) {
            System.out.print("입력 문자열 :");
            inStr = scanner.nextLine();
            System.out.println("출력 문자열 :" + inStr);
            System.out.println();
            if (inStr.equals("q")) {
                break;
            }
        }
    }
}
