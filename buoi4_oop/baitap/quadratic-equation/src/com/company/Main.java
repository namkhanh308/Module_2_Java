package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào c: ");
        double c = scanner.nextDouble();
        QuadraticEquation temp = new QuadraticEquation(a,b,c);
        double delta = temp.getDiscriminant();
        if(delta > 0 && a != 0){
            System.out.println("Nghiệm thứ nhất là: "+ temp.getRoot1());
            System.out.println("Nghiệm thứ hai là: "+ temp.getRoot2());
        }
        else if(delta ==0){
            System.out.println("Ptr có nghiệm kep là: "+ temp.getRoot1());
        }
        else {
            System.out.println("The equation has no roots");
        }
    }
}
