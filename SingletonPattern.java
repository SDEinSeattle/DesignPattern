package DesignPattern;

public class SingletonPattern {
    // Singleton design pattern comes under creation pattern
    // as this pattern provides one of the best ways to create an object.

    // This pattern involves a single class which is responsible to create an object
    // while making sure that only single object gets created.
    // This class provides a way to access its only object which can be accessed directly
    // without need to instantiate the object of the class.

    public static void main(String[] args) {
        // SingletonPattern, our demo class will use SingleObject class to get a SingleObject object.
        SingleObject object = SingleObject.getInstance();
        object.showMessage();

        // illegal construct
        // SingleObject o = new SingleObject();
        // The constructor is invisible
    }



}
