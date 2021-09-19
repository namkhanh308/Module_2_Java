package com.thuchanh;

import java.util.Scanner;

public class Ssquare {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter width: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
