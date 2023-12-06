package org.example.map.function;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Counter {
        public static void countChars(String string) {
            LinkedHashMap<Character, Long> charCounts = string.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

            charCounts.forEach((c, count) -> System.out.println("Символ " + c + " - " + count));
        }
    }