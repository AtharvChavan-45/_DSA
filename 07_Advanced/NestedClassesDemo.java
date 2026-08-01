public class NestedClassesDemo {
    public static void main(String[] args) {
        // --- 1. STATIC NESTED CLASS (Passing Outer via Method) ---
        // Creating an instance of the static inner class without an outer object
        System.out.println("=== 1. STATIC NESTED CLASS (Passing Outer via Method) ===");
        OuterStaticMethod.InnerStaticMethod innerMethodObj = new OuterStaticMethod.InnerStaticMethod();
        OuterStaticMethod outerObj1 = new OuterStaticMethod();
        // Passing the outer object as a parameter to access non-static fields
        innerMethodObj.fun(outerObj1);

        // --- 2. STATIC NESTED CLASS (Passing Outer via Constructor) ---
        System.out.println("\n=== 2. STATIC NESTED CLASS (Passing Outer via Constructor) ===");
        OuterStaticConstructor outerObj2 = new OuterStaticConstructor();
        // Passing the outer object into the inner class constructor
        OuterStaticConstructor.InnerConstructor innerConstObj = new OuterStaticConstructor.InnerConstructor(outerObj2);
        innerConstObj.fun();

        // --- 3. INNER CLASS (Non-Static Nested Class) ---
        // Creating an inner class object using an outer class instance
        System.out.println("\n=== 3. INNER CLASS (Non-Static Nested Class) ===");
        OuterRegular.InnerRegular innerRegObj = new OuterRegular().new InnerRegular();
        innerRegObj.fun();

        // --- 4. LOCAL CLASS ---
        // A class defined inside a code block/method
        System.out.println("\n=== 4. LOCAL CLASS ===");
        OuterLocal outerLocalObj = new OuterLocal();
        outerLocalObj.greet();

        // --- 5. ANONYMOUS CLASS ---
        // A class without a name used to override behavior on the fly
        System.out.println("\n=== 5. ANONYMOUS CLASS ===");
        Person p = new Person() {
            @Override
            public void introduce() {
                System.out.println("Hi, I am a guest (Anonymous Class)");
            }
        };
        p.introduce();

        // --- 6. BANK ACCOUNT HELPER CLASS EXAMPLE ---
        // Using a private static nested class as a helper utility
        System.out.println("\n=== 6. BANK ACCOUNT HELPER CLASS EXAMPLE ===");
        BankAccount account = new BankAccount();
        double interest = account.computeInterest(10000.0);
        System.out.println("Calculated Interest: " + interest);
    }
}

// ==========================================
// 1. Static Nested Class (Method Parameter Approach)
// ==========================================
class OuterStaticMethod {
    static int x = 4; // Static member
    int y = 10;       // Non-static member

    static class InnerStaticMethod {
        // Method accepts an outer reference to reach non-static members
        void fun(OuterStaticMethod outer) {
            System.out.println("Static x: " + x);
            System.out.println("Non-static y (via method parameter): " + outer.y);
        }
    }
}

// ==========================================
// 2. Static Nested Class (Constructor Approach)
// ==========================================
class OuterStaticConstructor {
    static int x = 4;
    int y = 20;

    static class InnerConstructor {
        private OuterStaticConstructor outerRef;

        // Constructor caches the outer reference
        public InnerConstructor(OuterStaticConstructor outerRef) {
            this.outerRef = outerRef;
        }

        void fun() {
            System.out.println("Static x: " + x);
            System.out.println("Non-static y (via constructor reference): " + outerRef.y);
        }
    }
}

// ==========================================
// USE CASES OF STATIC NESTED CLASSES
// ==========================================
/*
 1. As helper class for any outer class.
 2. Builder Design pattern.
 3. If you want to have static methods inside a nested class.
 4. Request/Response DTO.
*/

// ==========================================
// 3. Regular Inner Class (Non-Static)
// ==========================================
class OuterRegular {
    private int secretX = 100;

    public class InnerRegular {
        public void fun() {
            // Inner classes can directly access private members of the outer class
            System.out.println("Accessing Outer's private member directly: " + secretX);
        }
    }
}

// ==========================================
// 4. Local Class (Inside a Method)
// ==========================================
class OuterLocal {
    void greet() {
        int localVar = 50; // Effectively final variable

        // Defined locally inside a method block
        class LocalClass {
            void display() {
                System.out.println("Local class accessing method variable: " + localVar);
            }
        }

        LocalClass local = new LocalClass();
        local.display();
    }
}

// ==========================================
// 5. Anonymous Class Base
// ==========================================
class Person {
    public void introduce() {
        System.out.println("Hi, I am a person");
    }
}

// ==========================================
// 6. Bank Account Helper Class Example
// ==========================================
class BankAccount {
    public double computeInterest(double principalAmount) {
        // Utilizing a private helper static nested class
        return InterestCalculator.calculateYearly(principalAmount, 0.09);
    }

    // Hidden helper class encapsulated within BankAccount
    private static class InterestCalculator {
        public static double calculateYearly(double principal, double rate) {
            return principal * rate;
        }
    }
}