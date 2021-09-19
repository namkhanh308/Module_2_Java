public class Circle {
    private double radius;
    private String color;
    final static double pi = 3.14;
    Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    Circle(double radius){
        this.radius = radius;
        this.color = "red";
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        double d = this.radius * this.radius * pi;
        return d ;
    }
}
