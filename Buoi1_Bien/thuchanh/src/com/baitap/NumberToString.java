package com.baitap;

import java.sql.Array;
import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String string = String.valueOf(number);
        int arr[] = new int[string.length()];
        int out = number;
        int count = 0;
        while (out != 0){
            int temp = out%10;
            arr[count] = temp;
            count++;
            out = out / 10;
        }
        int first = 0;
        int last = arr.length-1;
        while(first < last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        String donvi[]  =  {"one","two","three","four","five","six","seven","eight","nine"};
        String chuc[] = {"ten","eleven","Twen", "thir", "four", "fif", "six","seven", "eigh", "nine"};
        if(arr.length == 1) {
            System.out.println(donvi[arr[0]-1]);
        }
        else if(arr.length == 2 && number < 20) {
            if(number>=10 && number < 12){
                System.out.println(chuc[arr[1]]);
            }
            else if(number == 12){
                System.out.println("twelve");
            }
            else {
                System.out.println(chuc[arr[1]] + "teen");
            }
        }
        else if(arr.length == 2 && number >= 20){
            if(number ==20){
                System.out.println("Twenty");
            }
            else if(arr[1] !=0 ) {
                System.out.println((chuc[arr[0]]) + "ty" + " " + donvi[arr[1]-1]);
            }
            else {
                System.out.println((chuc[arr[0]]) + "ty");
            }
        }
        else if(arr.length == 3 && number >= 100){
            if(arr[1] == 0 && arr[2] !=0 ){
                System.out.println(donvi[arr[0]-1] + " hundred" + " and " +donvi[arr[2]-1] );
            }
            else if(arr[1] == 1){
                if(arr[2] == 0 || arr[2] == 1){
                    System.out.println(donvi[arr[0]-1] + " hundred" + " and " +chuc[arr[2]] );
                }
               else if(arr[2] == 2){
                    System.out.println(donvi[arr[0]-1] + " hundred" + " and "+ " Twelve ");
               }
               else {
                    System.out.println(donvi[arr[0]-1] + " hundred" + " and " + chuc[arr[2]] + "teen");
                }
            }
            else if(arr[1] ==0 && arr[2] ==0){
                System.out.println(donvi[arr[0]-1] + " hundred");
            }
            else {
                if(arr[2] !=0 ) {
                    System.out.println(donvi[arr[0] - 1] + " hundred" + " and " + (chuc[arr[1]]) + "ty" + " " + donvi[arr[2] - 1]);
                }
                else {
                    System.out.println(donvi[arr[0] - 1] + " hundred" + " and " + (chuc[arr[1]]) + "ty" );
                }
            }
        }
    }
}

