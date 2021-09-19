package com.company;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.setX(x);
        this.setY(y);
    }
    public float [] getXY(){
        float [] a = {this.x,this.y};
        return a;
    }

    @Override
    public String toString() {
        return "(" + this.getX() + ","+ this.getY() + ")";
    }
}
