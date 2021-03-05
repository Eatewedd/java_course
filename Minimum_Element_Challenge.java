package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

      System.out.println(findMin(readIntegers(5)));
    }

    private static int[] readIntegers(int count) {

        int numbers[] = new int[count];

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number");
            numbers[i] += scanner.nextInt();
        }

        return numbers;
    }

    private static int findMin(int[] readIntegersArray) {

        int min = readIntegersArray[0];
        for(int i = 0; i < readIntegersArray.length; i++)
            if(readIntegersArray[i] < min) {
                min = readIntegersArray[i];
            }

        return min;
    }
}