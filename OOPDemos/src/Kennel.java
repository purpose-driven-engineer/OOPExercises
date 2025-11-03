public class Kennel {
    public static void main(String[] args) {

        Dog namedDog = new Dog("Maine", "German Shepherd", 5);
        namedDog.bark();
        String newDogFood = namedDog.eat("Flakes");
        System.out.println(newDogFood);

        Dog unnamedDog = new Dog();
        unnamedDog.name = "Fred";
        String food = unnamedDog.eat("Biscuits");

        System.out.println(unnamedDog.name + " is the name of the unnamed Dog and " + food);
    }
}
