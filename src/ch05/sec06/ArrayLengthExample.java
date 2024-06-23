package ch05.sec06;

public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] intArr = new int[]{84, 90, 96};
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }
        System.out.println(sum);
        double avg = (double) sum / intArr.length;
        System.out.println(avg);
    }
}
