public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        this.width=side;
        this.length=side;
        setWidth(side);
    }

    public Square(String color, boolean filled, double side) {
        super(color,filled,side,side);
    }

    public double getSide() {
        return length;
    }
    @Override
    public void setWidth(double width){
        this.width=width;
        this.length=width;
    }
    @Override
    public void setLength(double length){
        this.width=length;
        this.length=length;    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return length;
    }

    public void setSide(double side) {
        this.width=side;
        this.length=side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", side=" + getSide() +
                '}';
    }
}
