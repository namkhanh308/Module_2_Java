import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Resizeable [] resizeable = new Resizeable[2];
        resizeable[0] = new Circle(1);
        resizeable[1] = new Rectangle(5,7);

        for (Resizeable resizeable1: resizeable ) {
            Random generator = new Random();
            int value = generator.nextInt(100)+1;
            if(resizeable1 instanceof Circle){
                Circle circle = (Circle) resizeable1;
                System.out.println("Lúc đầu");
                System.out.println(circle);
                System.out.println("Diện tích lúc đầu là: "+ circle.getArea());
                System.out.println("Lúc sau");
                circle.resize(value);
                System.out.println(circle);
                System.out.println("Diện tích lúc sau là: "+ circle.getArea());
            }
            else if(resizeable1 instanceof Rectangle){
                Rectangle rectangle = (Rectangle) resizeable1;
                System.out.println("Lúc đầu");
                System.out.println(rectangle);
                System.out.println("Diện tích lúc đầu là: "+ rectangle.getArea());
                System.out.println("Lúc sau");
                rectangle.resize(value);
                System.out.println(rectangle);
                System.out.println("Diện tích lúc sau là: "+ rectangle.getArea());
            }
        }
    }
}
