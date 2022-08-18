package com.hillel.diakonov.homework.homework14;

public class AverageNumber {
    int[] array = new int[] {1, 2, 3, 4, 5};

    public static int getAverageNum(int[] array) {
        int average;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        average = sum / array.length;

        return average;
    }
}
