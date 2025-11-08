public class Zoo {
    public static void main(String[] args){
        Animal genericAnimal = new Animal("Generic ", 5);
        genericAnimal.eat();
        genericAnimal.makeSound();

        Wolf wildWolf = new Wolf("Wrangler", 7, "Swedish Wolf");
        System.out.println(wildWolf.getName() + " is a " + wildWolf.getBreed() + " and is " + wildWolf.getAge() + " years old.");
        wildWolf.eat();
        wildWolf.sleep();
        wildWolf.bark();
        wildWolf.makeSound();
    }
}
