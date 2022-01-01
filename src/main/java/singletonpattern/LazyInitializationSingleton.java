package main.java.singletonpattern;

public class LazyInitializationSingleton {
    // In lazy initialization, we would initialize the object, only if there is a request for singleton object
    // In this way, we will not be unnecessarily initializing the singleton object
    // Disadvantages: This singleton class is not thread safe, In case of multiple threads concurrently accessing getInstance() method, those threads might end up creating multiple instances of this class
    // Which violates singleton property
    private static LazyInitializationSingleton singletonInstance = null;

    // private constructor would prevent the users from creating the object out of this class
    private LazyInitializationSingleton() {}

    public static LazyInitializationSingleton getInstance() {
        if(null == singletonInstance) {
            singletonInstance = new LazyInitializationSingleton();
        }

        return singletonInstance;
    }
}
