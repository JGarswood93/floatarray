package com.Barton;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        float arr[] = new float[] {1f, 5f, 3f, 2f, 9f};

        System.out.println("Actual Values: ");
        for(float value : arr) {
            System.out.println("Value = " + value);
        }

        Arrays.fill(arr, 12f);

        System.out.println("New values after using fill() method: ");
        for(float value : arr) {
            System.out.println("Value = " + value);
        }
    }
}
