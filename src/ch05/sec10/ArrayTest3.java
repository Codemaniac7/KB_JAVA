package ch05.sec10;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        int multipleArrayLength = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
//                System.out.println(array[i][j]);
                sum += array[i][j];
                multipleArrayLength++;
            }
        }

        System.out.println(sum);
        System.out.println((double) sum / multipleArrayLength);
    }
}
