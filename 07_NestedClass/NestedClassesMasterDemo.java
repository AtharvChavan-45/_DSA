// =====================================================================================
// JAVA NESTED CLASSES COMPLETE GUIDE (Based on Coder Army Java Full Course #19)
// =====================================================================================

public class NestedClassesMasterDemo {
    public static void main(String[] args) {
        
        System.out.println("=== 1. STATIC NESTED CLASS DEMO ===" );
        // Static nested classes do NOT need an outer object to be instantiated.
        OuterStatic.InnerStatic staticInnerObj = new OuterStatic.InnerStatic();
        staticInnerObj.fun();

        System.out.println("\n=== 2. REGULAR INNER CLASS DEMO ===");
        // Regular inner classes REQUIRE an outer class object instance to be created.
        OuterRegular outerObj = new OuterRegular();
        OuterRegular.InnerRegular innerObj = outerObj.new InnerRegular();
        // Shorthand version: OuterRegular.InnerRegular innerObj = new OuterRegular().new InnerRegular();
        innerObj.fun();

        System.out.println("\n=== 3. LOCAL CLASS DEMO ===");
        // Local classes are defined inside a block (like a method) and used locally.
        OuterLocal outerLocalObj = new OuterLocal();
        outerLocalObj.displayMessage();

        System.out.println("\n=== 4. ANONYMOUS CLASS DEMO ===");
        // Anonymous classes allow you to declare and instantiate a class simultaneously on the fly.
        Person anonymousPerson = new Person() {
            @Override
            public void introduce() {
                System.out.println("Hi, I am a Guest (Overridden via Anonymous Class)");
            }
        };
        anonymousPerson.introduce();
        
        System.out.println("\n=== 5. BANK ACCOUNT HELPER CLASS DEMO ===");
        BankAccount account = new BankAccount();
        System.out.println("Computed Interest: " + account.computeInterest(10000.0));
    }
}


// =====================================================================================
// 1. STATIC NESTED CLASS
// =====================================================================================
// - Can contain static and non-static members.
// - Can ONLY access static members of the outer class directly.
class OuterStatic {
    static int staticVar = 10;
    int nonStaticVar = 20;

    static class InnerStatic {
        void fun() {
            System.out.println("Accessing outer static variable directly: " + staticVar);
            // System.out.println(nonStaticVar); // Error: Cannot access non-static fields directly without an outer instance reference.
        }
    }
}


// =====================================================================================
// 2. REGULAR INNER CLASS (Non-Static Nested Class)
// =====================================================================================
// - Associated with an instance of the outer class.
// - Can access BOTH static and non-static (including private) outer class members directly.
class OuterRegular {
    private int outerPrivateVar = 100;

    class InnerRegular {
        void fun() {
            System.out.println("Accessing outer private variable directly: " + outerPrivateVar);
        }
    }
}


// =====================================================================================
// 3. LOCAL CLASS
// =====================================================================================
// - Defined inside a specific block of code (like a method, loop, or if-statement).
// - Local variables of the enclosing scope accessed inside a local class must be 'effectively final'.
class OuterLocal {
    void displayMessage() {
        int localVar = 50; // Effectively final variable

        class LocalNested {
            void printValue() {
                System.out.println("Local class accessing method variable: " + localVar);
            }
        }

        LocalNested localObj = new LocalNested();
        localObj.printValue();
    }
}


// =====================================================================================
// 4. ANONYMOUS CLASS
// =====================================================================================
// - A class without a name. Used to extend a class or implement an interface on the fly for single-use cases.
class Person {
    public void introduce() {
        System.out.println("Hi, I am a standard person");
    }
}


// =====================================================================================
// 5. REAL-WORLD USE CASE: HELPER CLASS (Bank Account Example)
// =====================================================================================
class BankAccount {
    public double computeInterest(double principal) {
        // Utilizing a private static nested class as an encapsulated helper utility
        return InterestCalculator.calculateYearlyInterest(principal, 0.08);
    }

    // Hidden from outside classes; makes sense to exist only inside BankAccount logic
    private static class InterestCalculator {
        public static double calculateYearlyInterest(double p, double rate) {
            return p * rate;
        }
    }
}

// =====================================================================================
// USE CASES SUMMARY (As explained in the video):
// =====================================================================================
/*
  1. Static Nested Classes Use Cases:
     - As a helper/utility class for any outer class (e.g., InterestCalculator).
     - Used heavily in the Builder Design Pattern.
     - When you specifically need to have static methods/variables inside a nested class context.
     - Request/Response DTOs in frameworks like Spring Boot.

  2. Regular Inner Classes Use Cases:
     - Used when the inner class logic fundamentally depends on the state (instance variables) of the outer class object.

  3. Local Classes Use Cases:
     - Extremely rare in production; used for highly localized, one-off logic bound strictly to a single method block.

  4. Anonymous Classes Use Cases:
     - Used for quick, one-time method overrides or event handling (though largely replaced by modern Java Lambdas).
*/