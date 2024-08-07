//2. Multilevel Inheritance Problem:
// - Problem Statement: Create a multilevel inheritance structure with three classes: 'Animal' (base class), 'Mammal' (derived class), and 'Dog' (further derived class). The 'Animal' class should have an attribute 'species' and a method 'makeSound()'. The 'Mammal' class should add an attribute 'hasFur' and override 'makeSound()'. The 'Dog' class should add an attribute 'breed' and further override 'makeSound()' to specify the dog's sound. Use constructors to initialize attributes and ensure proper use of 'this' and 'super'.

class Animal{
    private String species;

    public Animal(String species){
        this.species = species;
    }

    public void makeSound(){
        System.out.println("Animal Sound....");
    }
}

class Mammal extends Animal{
    private String hasFur;

    public Mammal(String  species,String hasFur){
        super(species);
        this.hasFur = hasFur;
    }

    public void makeSound(){
        super.makeSound();
        System.out.println("Mammel sound :- ");
    }
}

class Dog extends Mammal{
    private String breed;

    public Dog(String species , String hasFur,String breed){
        super(species, hasFur);
        this.breed = breed;
    }

    public void makeSound(){
        super.makeSound();
        System.out.println("Bhau Bhau....");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Dog obj = new Dog("Mammel", "Gray", "Dog");
        obj.makeSound();
    }
}
