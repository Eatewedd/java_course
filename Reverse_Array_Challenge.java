package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

       int array[] = new int[] {
               1, 2, 3, 4, 5
       };

        reverse(array);

    }

    private static void reverse(int array[]) {

       int reversedArray[] = new int[array.length];
        int j = array.length;
        for(int i = 0; i < array.length; i++) {
            reversedArray[j - 1] = array[i];
            j--;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversedArray));

    }

}
