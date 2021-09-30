public class Main {
    public static void main(String[] args) {
    Circle cir = new Circle("красный",true,10);
    Rectangle rec = new Rectangle("Синий",false,5,10);
    Square squ = new Square("Красный",true,7);
        System.out.println(cir.toString()+"\n"+cir.getArea()+"\n"+cir.getPerimeter());
        System.out.println(rec.toString()+"\n"+rec.getArea()+"\n"+rec.getPerimeter());
        System.out.println(squ.toString()+"\n"+squ.getArea()+"\n"+squ.getPerimeter());

    }
}
