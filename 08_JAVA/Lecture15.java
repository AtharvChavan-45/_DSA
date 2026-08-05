// static belong to class only means if any value or behavior is same for all object that
// we will create for class so we make static

// one static method can only call another static method
// static method can only access static variable
// static method does not have access to this method

public class Lecture15 {
    public static void main(String[] args) {
        Student s1 = new Student("Aditya",18,101);
        Student s2 = new Student("Rohit",22,102);

        

        System.out.println(s1.name + "," + s1.age + "," + s1.rollnumber + "," + Student.collage);
        System.out.println(s2.name + "," + s2.age + "," + s2.rollnumber + "," + s2.collage);
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