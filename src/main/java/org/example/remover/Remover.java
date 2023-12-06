package org.example.remover;
import java.util.List;


    public class Remover {
        public static void remove(List<Integer> list) {
            list.removeIf(num -> num % 2 == 0);
        }


    }

