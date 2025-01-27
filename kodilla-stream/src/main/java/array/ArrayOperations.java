package array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println(numbers[n]));
        double average = IntStream.range(0, numbers.length)
                .map(a -> numbers[a])
                .average().orElse(0);
        return average;
    }
}
