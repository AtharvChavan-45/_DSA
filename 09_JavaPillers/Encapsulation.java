// Encapsulation -> binding data(variables) & methods(behavior) in a single class 
// restrict direct access using private access modifier
// understand pacakage by createing student class in school and collage package how to access it demo class


public class Encapsulation{
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount();
        obj1.deposit(500);
        obj1.withdraw(200);
        System.out.println(obj1.getbalance());

    }
}
class BankAccount{
    private double balance;

    public void deposit(int amount){
        balance += amount;
    }
    public void withdraw(int amount){
        balance -= amount;
    }
    // getter setters
    public double getbalance(){
        return balance;
    }
}
class Student{
    private String name;
    private int rollnumber;
    private int age;
    private String collage;

    Student(String name, int rollnumber, int age, String collage){
        this.name = name;
        this.rollnumber = rollnumber;
        this.age = age;
        this.collage = collage;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCollage(String collage){
        // we can add validation to check collage is real or there naac value like that
        this.collage = collage;
    }
}