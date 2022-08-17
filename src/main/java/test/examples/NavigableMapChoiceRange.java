package test.examples;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapChoiceRange {
    public static void main(String[] args) {

        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(90, "A");
        map.put(80, "B");
        map.put(70, "C");
        map.put(60, "D");
        map.put(50, "E");
        map.put(0, "F");

        String valueFloor = map.floorEntry(30).getValue();

        String valueCeil = map.floorEntry(30).getValue();
    }
}
