public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;

        System.out.println("A new dog named " + name + " has been enrolled!");
    }

    public Dog() {
        System.out.println("Also, an unnamed dog has been enrolled!");
    }

    public void bark(){
        System.out.println(name + " barks: Whoof!");
    }

    public String eat(String eat) {
        // System.out.println(name + " eats " + eat);
        return name + " eats " + eat;
    }
}
