public class PetStore {
    //demonstrating polymorphic behavior: Overriding (Runtime)
    public static void main(String[] args){
        Animal newAnimal = new Animal("Dane", 8);
        Wolf newWolf = new Wolf("Buddy", 4, "Golden Wolf");
        Animal anotherWolf = new Wolf("Lucy", 8, "Laden Brier");

        newAnimal.makeSound();
        newWolf.makeSound();
        anotherWolf.makeSound();

        //using loop to mimic polymorphic behavior
        Animal[] pets = new Animal[3];
        pets[0] = new Wolf("Max", 2, "baby wolf");
        pets[1] = new Animal("Whiskers", 6);
        pets[2] = new Wolf("Bella", 10, "poodle");

        //sounds @ petstore
        for (Animal pet : pets){
//            System.out.println(pet.getName() + ": ");
            pet.makeSound(); // calls the right method based actual object at runtime
        }
    }

}
