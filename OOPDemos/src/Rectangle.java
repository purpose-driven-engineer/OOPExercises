public class Rectangle extends Shape{
    private double length;
    private double width;
    private String type;

    public Rectangle(String color, String type, double length, double width){
        super(color, type);
        this.length = length;
        this.width = width;
    }

    //implementing abstract method

    @Override
    public double calculateArea() {
        return length * width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public String getType(){
        return type;
    }
}
