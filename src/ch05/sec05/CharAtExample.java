package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        System.out.println(ssn.charAt(6));
        char sex = ssn.charAt(6);
        if (sex == '1') {
            System.out.println("남자입니다.");
        } else {
            System.out.println("여자입니다.");
        }

    }
}
