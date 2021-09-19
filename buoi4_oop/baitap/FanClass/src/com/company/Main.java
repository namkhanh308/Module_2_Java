package com.company;

public class Main {

    public static void main(String[] args) {
        Fan f = new Fan();
        f.setSpeed(3);
        f.setRadius(10);
        f.setColor("yellow");
        f.setOn(true);
        System.out.println(f.toString());
        System.out.println();
        Fan f1 = new Fan();
        f1.setSpeed(2);
        f1.setRadius(5);
        f1.setColor("blue");
        System.out.println(f1.toString());
    }
}
