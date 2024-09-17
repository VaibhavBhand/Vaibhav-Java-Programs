package First_package;

//Define a superclass
class Animal {
 // Method that will be overridden in subclasses
 void makeSound() {
     System.out.println("Some generic animal sound");
 }
}

//Define a subclass Dog that extends Animal
class Dog extends Animal {
 // Override the makeSound method
 @Override
 void makeSound() {
     System.out.println("Woof");
 }
}

//Define a subclass Cat that extends Animal
class Cat extends Animal {
 // Override the makeSound method
 @Override
 void makeSound() {
     System.out.println("Meow");
 }
}

public class PolymorphismExample {
 public static void main(String[] args) {
     // Create objects of type Animal, Dog, and Cat
     Animal myAnimal = new Animal();
     Animal myDog = new Dog();
     Animal myCat = new Cat();

     // Call the makeSound method on each object
     myAnimal.makeSound();  // Outputs: Some generic animal sound
     myDog.makeSound();     // Outputs: Woof
     myCat.makeSound();     // Outputs: Meow

     // Demonstrate polymorphism by storing all objects in an Animal array
     Animal[] animals = {myAnimal, myDog, myCat};

     // Iterate through the array and call makeSound on each element
     for (Animal animal : animals) {
         animal.makeSound();
     }
 }
}
