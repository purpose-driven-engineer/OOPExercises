// concrete subclass of Shape
public class Circle extends Shape {
    private double radius;
    private String type;

    public Circle(String color, double radius, String type){
        super(color, type);
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
