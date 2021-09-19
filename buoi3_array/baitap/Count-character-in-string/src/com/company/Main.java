package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String str = "khanh";
        char in = input.charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if(in == a){
                count++;
            }
        }
        System.out.println(count);
    }
}
