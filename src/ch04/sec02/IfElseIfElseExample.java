package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;

        if(score >0&&score <=69) {
            System.out.println("점수가 0~69입니다. 등급은 D입니다.");
        } else if(score >69) {
            System.out.println("점수가 70~79입니다. 등급은 C입니다.");
        } else if(score >79) {
            System.out.println("점수가 80~89입니다. 등급은 B입니다.");
        } else {
            System.out.println("점수가 90~100입니다. 등급은 A입니다.");
        }
    }
}
