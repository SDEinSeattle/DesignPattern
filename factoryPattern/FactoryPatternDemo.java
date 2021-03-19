package DesignPattern.factoryPattern;

// In Factory pattern, we create object without exposing the creation logic to the client
// and refer to newly created object using a common interface.
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();

        Shape s1 = sf.getShape("Circle");
        s1.draw();

        Shape s2 = sf.getShape("Rectangle");
        s2.draw();
    }
}
