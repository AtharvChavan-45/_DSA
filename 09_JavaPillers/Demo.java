import collage.Student; // user defined pacakeg
//import school.Student; only one import can we do
// import collage.*; 
// java.util, java.lang, java.io -> built in package watch 58 min how built in package we access

public class Demo {

    public static void main(String[] args) {
       Student s1 = new Student();
       s1.print(); 
       school.Student s2 = new school.Student(); // access student class of school package
       s2.print();
    }
}