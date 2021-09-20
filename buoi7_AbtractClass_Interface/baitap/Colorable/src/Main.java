public class Main {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes[0] = new Circle(1);
        shapes[1] = new Rectangle(5,7);
        shapes[2] = new Square(3);

        for (Shape shape : shapes) {
            if(shape instanceof Colorable){
                Colorable colorable = (Colorable) shape;
                colorable.howToColor();
            }
            else {
                System.out.println(shape.getArea());
            }
        }
    }
}
