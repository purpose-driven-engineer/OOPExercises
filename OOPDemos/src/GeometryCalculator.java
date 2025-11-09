public class GeometryCalculator {

    public static void main(String[] args) {

        // abstract classes can't be instantiated

        Circle circle = new Circle("Red", 4.5, "Circle");
        Rectangle rectangle = new Rectangle("Green", "Rectangle", 3.4, 5.8);

        //polymorphic abstraction
        Shape[] shapes = new Shape[2];
        shapes[0] = circle;
        shapes[1] = rectangle;

        for (Shape s : shapes){
            s.displayColor(); // implementing concrete method from abstract class
            System.out.println("Area: " + s.calculateArea());
            System.out.println("----");
        }

    }
}
