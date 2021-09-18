public class Square extends Rectangle{
    double side;
    public Square() {
    }

    public Square(double side) {
        this.side=side;
        setWidth(side);
        setLength(side);
    }

    public Square(String color, boolean filled, double side) {
        super(color,filled,side,side);
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", side=" + side +
                '}';
    }
}
