public class Calculator {

    // polymorphic behavior: @overloading (compile-time)
    public int add(int a, int b){
        return a + b;
    }

    // overloading methods with 3 integers
    public int add(int a, int b, int c){
        return  a + b + c;
    }

    // overloading methods with 2 new data types and params
    public double add(double a, double b){
        return a + b;
    }

    // overloading methods with different type and order
    public String add(String s1, String s2){
        return s1 + s2;
    }


}
