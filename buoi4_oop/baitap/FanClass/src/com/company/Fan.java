package com.company;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST  = 3;
    int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan(){
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    @Override
    public String toString(){
        if(this.on == true){
            return ("speed: " + this.speed+ "\n"+ "color: " + this.color + "\n" + "radius: " + this.radius + "\n" + "fan is on") ;
        }
        else {
            return ("color: " + this.color + "\n" + "radius: " + this.radius + "\n" + "fan is off") ;
        }
    }
    String method1() {
        return "A";
    }
    

}
