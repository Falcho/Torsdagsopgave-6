package Task4;

public class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
       // System.out.println(side);
        return side*side;
    }
}
