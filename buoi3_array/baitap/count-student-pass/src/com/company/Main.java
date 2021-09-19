package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        int[] array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[i]);
            if(array[i] >= 5 && array[i] <=10 ){
                count++;
            }
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
