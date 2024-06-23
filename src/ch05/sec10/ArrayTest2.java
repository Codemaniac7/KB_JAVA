package ch05.sec10;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        int maxNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        System.out.println(maxNum);
    }
}
