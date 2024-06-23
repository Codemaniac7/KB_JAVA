package ch05.sec10;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = {95, 71, 84, 93, 87};
        int sum = 0;
        double avg = 0;
        for (int score : scores) {
            sum += score;
            avg = (double) sum / scores.length;
        }
        System.out.println("점수 총합:" + sum);
        System.out.println("평균 점수:" + avg);
    }
}
