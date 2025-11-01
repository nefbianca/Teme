package org.example.classActivity.ArrayMethods;

import java.lang.reflect.Array;

public class MinMax {
    // o metoda care intoarce maximul dintr-un sir de numere
    // {3,4,1,9,0,11,5} --> 11

    public static int getMax(int[] numbers) {
        int max=numbers[0];
        for(int i=1; i<numbers.length; i++) {
            if(max < numbers[i]){
                max=numbers[i];
            }
        }
        return max;
    }

    // o metoda care intoarce minimul

    public static int getMin(int[] numbers) {
        int min = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if(min > numbers[i]){
                min = numbers[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 4, 1, 9, 0, 11, 5};
        int maximum = getMax(numbers); // 11
        int minimum = getMin(numbers); // 0
        System.out.println("Maximul este: " + maximum);
        System.out.println("Minimul este: " + minimum);
    }
}
