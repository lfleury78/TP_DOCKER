package hello.hello;

public class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public String getName() {
        return "Circle";
    }
    
    public double getRadius() {
        return radius;
    }
}
