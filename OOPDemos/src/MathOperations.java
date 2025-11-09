public class MathOperations {
    public static void main(String[] args){
        Calculator calc = new Calculator();

        System.out.println("Two integers: " + calc.add(5, 6));
        System.out.println("Three integers: " + calc.add(2, 6, 9));
        System.out.println("Two doubles: " + calc.add(3.5, 9.0));
        System.out.println("Concatenated Strings: " + calc.add("Hello ", "World"));
    }
}
