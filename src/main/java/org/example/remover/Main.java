package org.example.remover;
import java.util.LinkedList;
import java.util.List;

import static org.example.remover.Remover.remove;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11665, 123224454));
        System.out.println("Список до удаления четных чисел: " + numbers);
        remove(numbers);
        System.out.println("Список после удаления четных чисел: " + numbers);
    }
}
