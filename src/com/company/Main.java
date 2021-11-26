package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };

        System.out.println("Initial: ");
        Matrix.print(matrix);
        System.out.println("Swapped rows [1 <-> 3]: ");
        //Matrix.swapRows(matrix, 1, 3);
        Matrix.print(matrix);
        System.out.println("Swapped columns [3 <-> 5]: ");
        //Matrix.swapColumns(matrix, 3, 5);
        Matrix.print(matrix);
        System.out.println("Multiplied by 2: ");
        //Matrix.mul(matrix, 2);
        Matrix.print(matrix);
        System.out.println("Matrix converted into array: ");
        System.out.println(Arrays.toString(Matrix.toArray(matrix)));
        System.out.println("Matrix max: " + Matrix.max(matrix));
    }
}
