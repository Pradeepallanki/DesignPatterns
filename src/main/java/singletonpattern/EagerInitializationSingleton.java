package main.java.singletonpattern;

public class EagerInitializationSingleton {
    // In this type of initialization, we keep the instance initialized upfront and return the instance as soon as there is a request.
    // Problem with this type of initialization is that, before even someone asking for the class object, we initialize the object in static method
    // If class involves some network calls, and nobody asks for the object of this class, unnecessarily we will make the network call and have the object ready

    private static EagerInitializationSingleton singletonInstance = new EagerInitializationSingleton();

    // private constructor would prevent the users from creating the object out of this class
    private EagerInitializationSingleton() {}

    public static EagerInitializationSingleton getInstance() {
        return singletonInstance;
    }
}
