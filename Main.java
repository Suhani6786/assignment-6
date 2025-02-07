// Parent class Animal
class Animal {
    public int age;
    public String gender;

    // Constructor
    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    // Method to check if the animal is a mammal
    public void isMammal() {
        System.out.println("This animal is a mammal.");
    }

    // Method for mating behavior
    public void mate() {
        System.out.println("This animal is mating.");
    }
}

// Subclass Fish extending Animal
class Fish extends Animal {
    private int sizeInFeet;

    // Constructor
    public Fish(int age, String gender, int sizeInFeet) {
        super(age, gender);
        this.sizeInFeet = sizeInFeet;
    }

    // Private method canEat()
    private void canEat() {
        System.out.println("This is a private method canEat() from class Fish");
    }
}

// Subclass Zebra extending Animal
class Zebra extends Animal {
    public boolean isWild;

    // Constructor
    public Zebra(int age, String gender, boolean isWild) {
        super(age, gender);
        this.isWild = isWild;
    }

    // Public method run()
    public void run() {
        System.out.println("The zebra is running.");
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Creating objects
        Animal myAnimal = new Animal(5, "Male");
        Fish myFish = new Fish(2, "Female", 3);
        Zebra myZebra = new Zebra(4, "Male", true);

        // Calling public methods
        myAnimal.isMammal();
        myAnimal.mate();

        myZebra.isMammal();
        myZebra.mate();
        myZebra.run();
    }
}

