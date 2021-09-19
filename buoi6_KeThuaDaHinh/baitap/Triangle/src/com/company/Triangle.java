package com.company;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(double side1,double side2, double side3, String color){
        super(color,true);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(){}
    public double getArea(){
        double nuachuvi = (this.side1+this.side2+this.side3)/2;
        double a = nuachuvi-this.side1;
        double b = nuachuvi-this.side2;
        double c = nuachuvi-this.side3;
        double temp = nuachuvi*(a)*(b)*(c);
        double dientich = Math.pow(temp,0.5);
        return dientich;
    }
    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
