// static belong to class only means if any value or behavior is same for all object that
// we will create for class so we make static

// one static method can only call another static method
// static method can only access static variable
// static method does not have access to this method

public class Lecture15 {
    public static void main(String[] args) {
        Student s1 = new Student("Aditya",18,101);
        Student s2 = new Student("Rohit",22,102);
        Random r1 =  new Random();
        System.out.print(r1.PI);

        final int x;
        x=4;
        System.out.print(x);
        System.out.println(s1.name + "," + s1.age + "," + s1.rollnumber + "," + Student.collage);
        System.out.println(s2.name + "," + s2.age + "," + s2.rollnumber + "," + s2.collage);

        print();
    } // all method in main class must be static to access it
    static void print(){

    }
}
class Student {
    String name;
    int age;
    int rollnumber;
    static String collage;

    Student(String name, int age, int rollnumber){
        this.name = name;
        this.age = age;
        this.rollnumber = rollnumber;
    }
    // Static block -> used to initialize static variable
    static{
        collage = "IIT";
    }

}
// Static can be variables, methods, inner class 

//Final method can be variable, method, class and parameters

class Random{
    // final double PI = 3.14;
    final double PI;
    static final int x;

    Random(){ // this also work
        this.PI = 3.14;
        // this.x = 4; this will not work
    }
    static {
        x=4; // this will work
    }
    
}

// why main is static in java ? -> if main method is not static we require to make object of main class