package main.java.singletonpattern;

public class DoubleCheckLockingSingleton {
    // This is a optimized and thread safe way of initializing a singleton object
    // There is only a  block level synchronization here, In case of multiple threads accessing getInstance() method, If singletonInstance is already initialized,
    // then, the same instance will be returned. If in case singletonInstance is null, then one thread will acquire the lock and all the other threads will wait for the lock to be released
    // By the time, singleton instance will be initialized and available, which will be returned for all the threads.

    private volatile static DoubleCheckLockingSingleton singletonInstance = null;

    private DoubleCheckLockingSingleton() {}

    public static DoubleCheckLockingSingleton getInstance() {
        if(null != singletonInstance)
            return singletonInstance;

        synchronized (singletonInstance) {
            if(null == singletonInstance)
                singletonInstance = new DoubleCheckLockingSingleton();
        }

        return singletonInstance;
    }
}
