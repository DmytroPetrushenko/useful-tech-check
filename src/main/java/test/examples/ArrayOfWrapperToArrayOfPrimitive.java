package test.examples;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayOfWrapperToArrayOfPrimitive {
    public static void main(String[] args) {
        String input = "rRRRtoyoЕЕЕrppeWWWpqetRrr";
        System.out.println(removeStream(input));
    }

    static char[] removeStream(String string) {
        return ArrayUtils.toPrimitive(Arrays.stream(string.split(""))
                .map(s -> s.toLowerCase().charAt(0))
                .map(c -> c == 'r' ? '!' : c)
                .collect(Collectors.toList()).toArray(Character[]::new));
    }
}
