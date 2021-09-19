package com.thuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class DolarToVnD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền(USD) cần chuyền: ");
        long usd = scanner.nextLong();
        long vnd = usd*23000;
        System.out.println("Số tiền của bạn là: "+ vnd + " VND");
    }
}
