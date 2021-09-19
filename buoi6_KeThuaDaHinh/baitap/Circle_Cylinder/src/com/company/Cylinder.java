package com.company;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius,String color, double height){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double TheTich(){
        double a = 2*3.14*this.getRadius()*this.height;
        return a;
    }
    @Override
    public String toString(){
        return "Radius: "+ this.getRadius()+ "; \n" + "color: "+ this.getColor() + "; \n" + "Height: "+ this.getHeight();
    }
}
