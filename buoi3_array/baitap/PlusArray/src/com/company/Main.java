package com.company;

import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int []a = {1,2,3,9};
        int []b = {4,5,6};
        int []c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = a.length; i < c.length; i++) {
            c[i] = b[i-a.length];
        }
        System.out.println(Arrays.toString(c));
    }
}
