package com.hillel.diakonov.homework.homework14;

public class SquareMatrix {
    int[][] Matrix = new int[3][4];

    public static boolean CheckSquareMatrix(int[][] array) {
        int colsCounter = 0, rowsCounter = 0;

        for (int i = 0; i < array.length; i++) {
            rowsCounter = 0;
            for (int j = 0; j < array[i].length; j++) {
                rowsCounter++;
            }
            colsCounter++;
        }

        if(rowsCounter == colsCounter) return true;
        else return false;
    }
}
