public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        this.setWidth(side);
        this.setLength(side);
    }

//    @Override
//    public void setWidth(double width) {
//        setWidth(width);
//    }
//
//    @Override
//    public void setLength(double length) {
//        setLength(length);
//    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}