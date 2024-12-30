interface Drawable {
    void draw(); // Abstract method to be implemented by subclasses
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class TestInterface1 {
    public static void main(String[] args) {
        Drawable drawable; // Interface reference

        // Dynamic method dispatch with polymorphism
        drawable = new Circle();
        drawable.draw();

        drawable = new Rectangle();
        drawable.draw();
    }
}
