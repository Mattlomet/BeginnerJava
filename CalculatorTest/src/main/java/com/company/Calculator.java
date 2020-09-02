package com.company;

public class Calculator {

    public int sumArray(int[] testArrayOne, int[] testArrayTwo) {
        int arrayTotal = 0;

        for (int i = 0; i < testArrayOne.length; i++) {
            arrayTotal += testArrayOne[i];
        }
        for (int i = 0; i < testArrayTwo.length; i++) {
            arrayTotal += testArrayTwo[i];
        }

        return arrayTotal;

    }

    public int[] arrayify(int size, int startValue) {
        int[] newArray = new int[size];

        for (int i = 0; i < size ; i++) {
            newArray[i] = startValue++;
        }

        return newArray;
    }
}
