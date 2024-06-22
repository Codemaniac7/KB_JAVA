package ch04.sec09;

public class exam03 {
    public static void main(String[] args) {
        for (int i = 6; i > 1; i--) {
            for (int j = 7; j > i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
