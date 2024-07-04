package ch17.sec10;

import java.util.ArrayList;
import java.util.List;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();

        System.out.println("평균: "+ avg);
    }
}
