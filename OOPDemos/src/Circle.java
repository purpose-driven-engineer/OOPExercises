// concrete subclass of Shape
public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    // implementing the abstract method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
