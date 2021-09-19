package com.company;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.getName());
        System.out.println(student1.getClasses());
        System.out.println();
        Student student2 = new Student();
        student2.setName("Iron Man");
        student2.setClasses("C03");
        System.out.println(student2.getName());
        System.out.println(student2.getClasses());
    }
}
