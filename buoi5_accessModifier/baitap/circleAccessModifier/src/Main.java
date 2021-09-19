public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
        Circle circle1 = new Circle(5);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getRadius());
    }
}
