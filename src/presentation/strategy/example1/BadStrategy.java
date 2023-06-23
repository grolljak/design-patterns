package presentation.strategy.example1;

import java.util.List;

public class BadStrategy {

    public static int sumValues(List<Integer> values) {
        int result = 0;
        for (Integer value : values) {
            result += value;
        }
        return result;
    }

    public static int sumEvenValues(List<Integer> values) {
        int result = 0;
        for (int value : values) {
            if (value % 2 == 0) {
                result += value;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        final List<Integer> values = List.of(1, 2, 3, 4);

        System.out.println(sumValues(values));
        System.out.println(sumEvenValues(values));
    }
}
