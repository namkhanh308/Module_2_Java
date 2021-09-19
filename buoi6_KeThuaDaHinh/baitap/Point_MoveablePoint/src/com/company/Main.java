package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MoveablePoint a = new MoveablePoint(1, 1, 2, 2);
        System.out.println(a.toString());
        System.out.println(Arrays.toString(a.getXY()));
        System.out.println("----------");
        MoveablePoint b = a.move();
        System.out.println(Arrays.toString(b.getXY()));
        System.out.println(b.toString());
    }
}
