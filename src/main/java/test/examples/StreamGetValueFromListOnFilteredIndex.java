package test.examples;

import java.util.List;
import java.util.stream.IntStream;

public class StreamGetValueFromListOnFilteredIndex {
    public int getOddSum(List<Integer> input) {
        return IntStream.range(0, input.size()).filter(i -> i % 2 == 0).map(input::get).sum();
    }
}
