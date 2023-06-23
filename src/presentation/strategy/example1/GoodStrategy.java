package presentation.strategy.example1;

import java.util.List;
import java.util.function.IntPredicate;

public class GoodStrategy {

    public static int sumValues(List<Integer> values, IntPredicate selector) {
        int result = 0;
        for (Integer value : values) {
            if (selector.test(value)) {
                result += value;
            }
        }
        return result;
    }

    private static boolean isEven(Integer number) {
        return number % 2 == 0;
    }

    private static boolean isOdd(Integer number) {
        return !isEven(number);
    }

    public static void main(String[] args) {
        final List<Integer> values = List.of(1, 2, 3, 4);

        System.out.println(sumValues(values, number -> true));
        System.out.println(sumValues(values, GoodStrategy::isEven));
        System.out.println(sumValues(values, GoodStrategy::isOdd));
    }
}
