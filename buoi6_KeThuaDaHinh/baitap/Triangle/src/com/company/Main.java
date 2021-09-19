package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh thứ nhất");
        double side1 = scanner.nextDouble();
        System.out.println("Nhập vào cạnh thứ hai");
        double side2 = scanner.nextDouble();
        System.out.println("Nhập vào cạnh thứ ba");
        double side3 = scanner.nextDouble();
        System.out.println("Nhập vào màu sắc của tam giác");
        Scanner scanner1 = new Scanner(System.in);
        String color = scanner1.nextLine();
	    Triangle triangle = new Triangle(side1,side2,side3,color);
        System.out.println("Màu sắc của tam giác là: "+triangle.getColor());
        System.out.println("Diện tích của tam giác là: "+ triangle.getArea());
        triangle.getArea();
        System.out.println("Chu vi của tam giác là: "+ triangle.getPerimeter());
    }
}
