package org.example.arrays.remover;

public class DuplicatesRemover {
    public static int[] removeDuplicates(int[] numbs) {
        int n = numbs.length;
        int currentIndex = 0;

        for (int i = 0; i < n - 1; i++) {
            if (numbs[i] != numbs[i + 1]) {
                numbs[currentIndex++] = numbs[i];
            }
        }
        numbs[currentIndex++] = numbs[n - 1];

        for (int i = currentIndex; i < numbs.length; i++) {
            numbs[currentIndex] = 0;
            currentIndex++;
        }

        return numbs;
    }
}
