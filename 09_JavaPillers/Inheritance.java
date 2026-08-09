/**
 * Inheritance
 */
public class Inheritance {

    public static void main(String[] args) {
        EngineerStudent obj1 = new EngineerStudent();
        obj1.markAttendance();
        obj1.atttendlab();
        Student s1 = new Student();
        s1.markAttendance(); // this will work
        // s1.attendlab(); // error cannot access child method
    }
}
class Student{
    String name;
    int age;

    void markAttendance(){
        System.out.println("Attendance marked");
    }
}

class EngineerStudent extends Student{
    void atttendlab(){
        System.out.println("Attendent lab");
    }
}