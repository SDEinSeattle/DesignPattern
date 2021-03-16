package DesignPattern;


public class SingleObject {

    //SingleObject class have its constructor as private and have a static instance of itself.

    private static SingleObject instance = new SingleObject();

    private SingleObject() {

    }

    // SingleObject class provides a static method to get its static instance to outside world.
    // SingletonPattern, our demo class will use SingleObject class to get a SingleObject object.
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, this is a Singleton class!");
    }
}
