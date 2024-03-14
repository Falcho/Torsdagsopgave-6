package Task4;

public class Main {
    public static void main(String[]args){
        ShapeBuilder builder = new ShapeBuilder();
        Circle circle1 = new Circle(5);
        Square square1 = new Square(5);
        Circle circle2 = new Circle(10);
        Square square2 = new Square(14);

        System.out.println(circle1.getArea());

        builder.addShape(circle1);
        builder.addShape(circle2);
        builder.addShape(square1);
        builder.addShape(square2);

        System.out.println(builder.getTotalArea());


    }
}
