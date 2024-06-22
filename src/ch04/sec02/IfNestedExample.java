package ch04.sec02;

public class IfNestedExample {
    public static void main(String[] args) {
        int score = (int)((Math.random()*20)+81);
        String grade;
        if(score<100&&score>=95) {
            System.out.println("점수: " + score);
            grade = "A+";
            System.out.println("학점: " + grade);
        } else if(score>=90&&score<95) {
            System.out.println("점수: " + score);
            grade = "A";
            System.out.println("학점: " + grade);
        } else if(score>=85&&score<90) {
            System.out.println("점수: " + score);
            grade = "B+";
            System.out.println("학점: " + grade);
        } else if(score>=81&&score<85) {
            System.out.println("점수: " + score);
            grade = "B";
            System.out.println("학점: " + grade);
        }
    }
}
