package com.company;

public class Point3D extends Point2D{
    private float z = 0.0f;

//    public Point3D(){}
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y , float z){
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }
    public float [] getXYZ(){
        float []a = {this.getX(),this.getY(),this.getZ()};
        return a;
    }

    @Override
    public String toString() {
        return "(" + this.getX() + ","+ this.getY() + "," + this.getZ()+")";
    }
}
