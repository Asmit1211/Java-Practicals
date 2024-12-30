class Bank {
    // Method to be overridden by subclasses
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {
    @Override
    int getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank {
    @Override
    int getRateOfInterest() {
        return 9;
    }
}

public class Practical6  {
    public static void main(String[] args) {
        // Polymorphism: Using parent class reference for child class objects
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();

        // Printing the rate of interest for each bank
        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + icici.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + axis.getRateOfInterest());
    }
}
