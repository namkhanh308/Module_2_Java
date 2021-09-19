package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Point2D a = new Point2D(1,1);
        System.out.println(Arrays.toString(a.getXY()));
        System.out.println(a.toString());
        System.out.println();
        Point3D b = new Point3D(1,2,3);
        System.out.println(Arrays.toString(b.getXYZ()));
        System.out.println(b.toString());
    }
}
