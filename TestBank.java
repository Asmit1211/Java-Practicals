abstract class Bank {
    // Abstract method to be implemented by subclasses
    abstract int getRateOfInterest();
}

class SBI extends Bank {
    @Override
    int getRateOfInterest() {
        return 7;
    }
}

class PNB extends Bank {
    @Override
    int getRateOfInterest() {
        return 8;
    }
}

public class TestBank {
    public static void main(String[] args) {
        Bank bank; // Reference of abstract class
        
        // Polymorphic behavior
        bank = new SBI();
        System.out.println("Rate of Interest for SBI: " + bank.getRateOfInterest() + "%");
        
        bank = new PNB();
        System.out.println("Rate of Interest for PNB: " + bank.getRateOfInterest() + "%");
    }
}
