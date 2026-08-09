// Parent Class (Superclass)
class Student {
    String name;
    int age;
    int x = 10; // Variable to demonstrate variable shadowing

    // 3. Parent Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parent class constructor called.");
    }

    // Method to demonstrate method overriding
    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Child Class (Subclass)
class EngineeringStudent extends Student {
    String college;
    int x = 20; // Child variable shadowing parent variable 'x'

    // 3. Child Constructor using super() to call parent constructor
    public EngineeringStudent(String name, int age, String college) {
        super(name, age); // Calls Student(String name, int age)
        this.college = college;
        System.out.println("Child class constructor called.");
    }

    @Override
    public void printDetails() {
        // 2. Calling Parent Class Method using super.printDetails()
        super.printDetails(); 
        
        System.out.println("College: " + college);
        
        // 1. Accessing Parent and Child Variables using super and this
        System.out.println("Parent variable x: " + super.x); // Accesses 10
        System.out.println("Child variable x: " + this.x);   // Accesses 20
    }
}

// Main Execution Class
public class Main {
    public static void main(String[] args) {
        // Creating an object of EngineeringStudent
        EngineeringStudent es = new EngineeringStudent("Aditya", 22, "IIT Guwahati");
        
        System.out.println("\n--- Calling printDetails() ---");
        es.printDetails();
    }
}