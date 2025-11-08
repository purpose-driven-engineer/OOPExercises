public class Wolf extends Animal{
    private String breed;

    public Wolf(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }

    public void bark(){
        System.out.println(getName() + " barks Whoof!");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Bark!");
    }
}
