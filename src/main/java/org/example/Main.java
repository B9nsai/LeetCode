package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        printArray(createTestArray());
    }

    private static void printArray(int[][] array) {
        for (int[] i: array) {
            for (int j: i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static int[][] createTestArray() {
        int[][] array = new int[3][3];

        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = count;
                count++;
            }
        }
        return array;
    }
}