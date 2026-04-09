package hello.hello;

public class Square extends Shape {
    private double side;
    
    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be positive");
        }
        this.side = side;
    }
    
    @Override
    public double getArea() {
        return side * side;
    }
    
    @Override
    public double getPerimeter() {
        return 4 * side;
    }
    
    @Override
    public String getName() {
        return "Square";
    }
    
    public double getSide() {
        return side;
    }
}
