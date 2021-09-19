package com.company;

public class QuadraticEquation {
    private double a,b,c;
    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        double delta = (this.b)*(this.b) - 4*(this.a)*(this.c);
        return delta;
    }
    public double getRoot1(){
        double delta = this.getDiscriminant();
        double r1 = (-b + Math.pow(delta,0.5))/(2*a);
        return r1;
    }
    public double getRoot2(){
        double delta = this.getDiscriminant();
        double r2 = (-b - Math.pow(delta,0.5))/(2*a);
        return r2;
    }

}
