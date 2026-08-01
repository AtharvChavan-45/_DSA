public class Demo2 {
    public static void main(String[] args) {
        
        // Step 1: Create an object of the Outer class first
        Outer outer = new Outer();
        
        // Step 2: Create an object of the Inner class using the outer object reference
        Outer.Inner inner = outer.new Inner();
        
        // (Alternatively, you can write it in one line like this:)
        // Outer.Inner inner = new Outer().new Inner();

        // Step 3: Call the method inside the inner class
        inner.fun();
    }
}

class Outer {
    int x = 10; // Non-static member

    // Regular Inner Class (Notice there is NO 'static' keyword here)
    class Inner {
        void fun() {
            // An inner class can directly access outer class variables
            System.out.println(x); 
        }
    }
}