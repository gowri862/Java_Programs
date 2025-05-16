// Base class
class Payment {
    public void makePayment(double amount) {
        System.out.println("Processing generic payment of ₹" + amount);
    }
}

// Derived class: CreditCard
class CreditCard extends Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " made using Credit Card.");
    }
}

// Derived class: PayPal
class PayPal extends Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " made using PayPal.");
    }
}

// Derived class: UPI
class UPI extends Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " made using UPI.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Polymorphic references
        Payment p1 = new CreditCard();
        Payment p2 = new PayPal();
        Payment p3 = new UPI();

        // Same method call, different behavior
        p1.makePayment(500.0);
        p2.makePayment(250.0);
        p3.makePayment(100.0);
    }
}
