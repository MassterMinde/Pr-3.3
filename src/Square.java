public class Square extends Rectangle{
    double side;
    public Square() {
    }

    public Square(double side) {
        this.side=side;
        setWidth(side);
    }

    public Square(String color, boolean filled, double side) {
        super(color,filled,side,side);
        this.side=side;
    }

    public double getSide() {
        return side;
    }
    @Override
    public void setWidth(double width){
        this.side=width;
    }
    @Override
    public void setLength(double length){
        this.side=length;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
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
