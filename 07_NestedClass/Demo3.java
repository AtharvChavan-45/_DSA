public class Demo3 {
    public static void main(String[] args) {
        // Create an instance of the Outer class
        Outer outer = new Outer();
        
        // Create an instance of the static Inner class without needing the outer instance
        Outer.Inner inner = new Outer.Inner();
        
        // Call the fun method, passing the 'outer' object as a parameter 
        // to give the static inner class access to non-static outer members
        inner.fun(outer);
    }
}

// Static nested class example from the video
class Outer {
    
    static int x = 4; // Static member (accessible directly by static nested class)
    int y;            // Non-static member (requires an Outer instance to access)

    static class Inner {
        
        // The method accepts an Outer object reference as a parameter
        void fun(Outer outer) {
            // Direct access to static variable x
            System.out.println(x);
            
            // Accessing non-static variable y using the passed Outer instance reference
            System.out.println(outer.y);
        }
    }
}