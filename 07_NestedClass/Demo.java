public class Demo {
    public static void main(String[] args) {
        // 1. Create an instance of the Outer class
        Outer outer = new Outer();
        
        // 2. Pass the 'outer' instance into the Inner class constructor 
        // so the inner class object holds a reference to it
        Outer.Inner inner = new Outer.Inner(outer);
        
        // 3. Call the method without needing to pass 'outer' again
        inner.fun();
    }
}

class Outer {
    
    static int x = 4; // Static member
    int y;            // Non-static member

    static class Inner {
        // Field to store the reference of the Outer class
        private Outer outer;

        // Constructor that accepts and stores the Outer class reference
        public Inner(Outer outer) {
            this.outer = outer;
        }

        void fun() {
            // Direct access to static variable x
            System.out.println(x);
            
            // Accessing non-static variable y using the stored Outer instance reference
            System.out.println(outer.y);
        }
    }
}