package com.company;

public class Main {

    public static void main(String[] args) {
        StopWatch s = new StopWatch();
        int t = 0;
        while (t <= 30) {
            System.out.println(s.getElapsedTime());
            t++;
        }
        ;
    }
}
