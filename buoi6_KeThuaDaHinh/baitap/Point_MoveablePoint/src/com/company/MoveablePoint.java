package com.company;

public class MoveablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(float x, float y ,float xSpeed,float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
//    public MoveablePoint(){    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.setXSpeed(xSpeed);
        this.setYSpeed(ySpeed);
    }
    public float[] getSpeed(){
        float [] a = {this.getXSpeed(),this.getYSpeed()};
        return a;
    }

    @Override
    public String toString() {
        return "(" + this.getX() + ","+ this.getY() + "),speed = (" + this.getXSpeed() + "," + this.getYSpeed()+")" ;
    }
    public MoveablePoint move(){
        this.setX(this.getX()+ this.getXSpeed());
        this.setY(this.getY() + this.getYSpeed());
        return this;
    }
}
