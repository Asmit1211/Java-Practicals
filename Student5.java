public class Student5 {
    private int id;
    private String name;

    // Default constructor
    public Student5() {
        System.out.println("Default Constructor called.");
        this.id = 0; // Initialize default values
        this.name = "Unknown";
    }

    // Parameterized constructor
    public Student5(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Display method to reduce code duplication
    public void displayInfo() {
        System.out.println("Student Id: " + id + "\nStudent Name: " + name);
    }

    public static void main(String[] args) {
        System.out.println("\nDefault Constructor values: \n");
        Student5 defaultStudent = new Student5();
        defaultStudent.displayInfo();

        System.out.println("\nParameterized Constructor values: \n");
        Student5 parameterizedStudent = new Student5(10, "Asmit");
        parameterizedStudent.displayInfo();
    }
}
