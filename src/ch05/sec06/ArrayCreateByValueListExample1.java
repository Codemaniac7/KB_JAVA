package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Fall", "Winter"};

        int[] scores = {83, 90, 87};

        System.out.println("season[0]:" + season[0]);
        System.out.println("season[1]:" + season[1]);
        System.out.println("season[2]:" + season[2]);
        System.out.println("season[3]:" + season[3]);
        System.out.println();
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double avg = sum / scores.length;
        System.out.println("총합:" + (int) sum);
        System.out.println("평균:" + avg);
    }
}
