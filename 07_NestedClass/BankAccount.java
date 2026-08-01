class BankAccount {
    
    // A public method to compute interest using the helper inner class
    public double computeInterest(double principalAmount) {
        // Accessing the private static nested helper class to perform calculations
        double yearlyInterest = InterestCalculator.calculateYearly(principalAmount, 0.09);
        return yearlyInterest;
    }

    // Private static nested helper class (hidden from the outside world)
    private static class InterestCalculator {
        
        // Static method to calculate yearly interest
        public static double calculateYearly(double principal, double rate) {
            return principal * rate;
        }
        
        // You could also add other helper methods here, e.g., calculateMonthly()
    }
}

public class Demo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        double interest = account.computeInterest(10000.0);
        System.out.println("Calculated Interest: " + interest);
    }
}