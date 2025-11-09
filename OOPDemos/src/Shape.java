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

    public String getTypee(){
        return type;
    }

    // abstract method
    public abstract double calculateArea();

    // concrete method
    public void displayColor(){
        System.out.println(name + "'s color is: " + color);
    }
}
