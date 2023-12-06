package org.example.arrays.myArrays;

import org.example.arrays.remover.DuplicatesRemover;

import java.util.Arrays;




public class MyArrays {
    public static void main(String[] args) {
        int[] numbs = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNumbs = {0, 1, 2, 3, 4, 0, 0, 0, 0, 0};
        int[] result = DuplicatesRemover.removeDuplicates(numbs);

        System.out.println(Arrays.equals(result, expectedNumbs));
    }
}
