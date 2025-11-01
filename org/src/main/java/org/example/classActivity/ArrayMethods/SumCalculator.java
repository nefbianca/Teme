package org.example.classActivity.ArrayMethods;

public class SumCalculator {

    public static int sumArray(int[] array) {
        int sum = 0; // Inițializam variabila sum la 0.

        for (int num: array) {
            sum += num;  // Adunam elementul curent la suma totala
        } return sum;
    }

    public static void main(String[] args) {
        int[] example = {1, 2, 3, 4, 5};
        int result = sumArray(example);
        System.out.println("Input: [1, 2, 3, 4, 5] | Output: " + result);

    }

}
