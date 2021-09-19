public class Main {
    public static void main(String[] args) {
        Square square = new Square(3);
        System.out.println(square.getPerimeter());
        square.setSide(1);
        System.out.println(square.getPerimeter());
        System.out.println(square.toString());


    }
}
