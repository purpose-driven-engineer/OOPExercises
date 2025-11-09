// describing Abstract principle
public abstract class Shape {
    private String color;
    private String type;

    public Shape(String color, String type){
        this.color = color;
        this.type = type;
    }

    public String getColor(){
        return color;
    }

    public String getType(){
        return type;
    }

    // abstract method
    public abstract double calculateArea();

    // concrete method
    public void displayColor(){
        System.out.println(type + "'s color is: " + color);
    }
}
